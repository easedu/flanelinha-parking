package br.com.flanelinhaparking.app.parkings.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.flanelinhaparking.app.R
import br.com.flanelinhaparking.app.parkings.model.Parking
import kotlinx.android.synthetic.main.parking_row.view.*

class ParkingListAdapter(
        private val context: Context,
        private val parkings: List<Parking>?,
        private val onDeleteListener: (adapterPosition: Int) -> Unit,
        private val onUpdateListener: (adapterPosition: Int) -> Unit
) :
        RecyclerView.Adapter<ParkingListAdapter.ParkingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkingViewHolder {
        return ParkingViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.parking_row, parent, false))
    }

    override fun getItemCount(): Int {
        var count = 0
        parkings?.let{
            count = it.size
        }
        return count
    }

    override fun onBindViewHolder(holder: ParkingViewHolder, position: Int) {
        holder.bindView(parkings?.get(position))
    }

    inner class ParkingViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView) {

        fun bindView(parking: Parking?) = with(itemView){
            tvName.text = parking?.name
            tvAddress.text = parking?.address

            iv_delete.setOnClickListener({
                onDeleteListener(adapterPosition)
            })

            iv_edit.setOnClickListener({
                onUpdateListener(adapterPosition)
            })
        }

    }

}
