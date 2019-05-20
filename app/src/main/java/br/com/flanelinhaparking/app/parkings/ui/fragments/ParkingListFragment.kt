package br.com.flanelinhaparking.app.parkings.ui.fragments

import android.arch.lifecycle.Observer
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.flanelinhaparking.app.R
import br.com.flanelinhaparking.app.parkings.model.Parking
import br.com.flanelinhaparking.app.parkings.ui.ParkingListAdapter
import br.com.flanelinhaparking.app.parkings.ui.viewmodel.ParkingViewModel
import br.com.flanelinhaparking.app.common.util.DialogUtil
import kotlinx.android.synthetic.main.fragment_parking_list.*

class ParkingListFragment : Fragment() {

    private lateinit var parkingViewModel: ParkingViewModel
    private var parkings: List<Parking>? = null
    private var parkingListAdapter: ParkingListAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_parking_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        parkingViewModel = ParkingViewModel(activity!!)
        insert_parking_button.setOnClickListener({
            DialogUtil.showInsertUpdateDialog(context!!,null, resources.getString(R.string.register_label), action = {
                parking -> parkingViewModel.insertParkings(parking)
            })
        })
        loadParkings()
        setupRecyclerView()
    }

    private fun loadParkings(){
        parkingViewModel.loadParkings()
    }

    private fun setupRecyclerView(){
        rvParking.layoutManager = LinearLayoutManager(context!!)

        parkingViewModel.parkings.observe(this, Observer<List<Parking>> {
            parkings = it
            parkingListAdapter = ParkingListAdapter(
                    activity!!,
                    parkings,
                    onDeleteListener = {
                        adapterPosition ->  deleteItemList(adapterPosition)
                    },
                    onUpdateListener = {
                        adapterPosition ->  updateItemList(adapterPosition)
                    }
            )
            rvParking.adapter = parkingListAdapter

            if(it!!.isEmpty()){
                container_no_items.visibility = View.VISIBLE
                rvParking.visibility = View.GONE
            } else {
                container_no_items.visibility = View.GONE
                rvParking.visibility = View.VISIBLE
                rvParking.adapter?.notifyDataSetChanged()
            }
        })
    }

    private fun updateItemList(adapterPosition: Int){
        val parking = parkings?.get(adapterPosition)

        DialogUtil.showInsertUpdateDialog(context!!, parking, resources.getString(R.string.update_label), action = {
            parkingViewModel.updateParking(parking!!)
        })
    }

    private fun deleteItemList(adapterPosition: Int){
        val parking = parkings?.get(adapterPosition)

        DialogUtil.showDeleteDialog(activity as Context, parking,  deleteAction = {
            parkingViewModel.deleteParking(parking)
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        parkingViewModel.dispose()
    }

}

