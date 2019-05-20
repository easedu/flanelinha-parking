package br.com.flanelinhaparking.app.cars.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.flanelinhaparking.app.R
import br.com.flanelinhaparking.app.cars.model.Car
import kotlinx.android.synthetic.main.cars_row.view.*

class CarsListAdapter(
        private val context: Context,
        private val cars: List<Car>?,
        private val onDeleteListener: (adapterPosition: Int) -> Unit,
        private val onUpdateListener: (adapterPosition: Int) -> Unit
) :
        RecyclerView.Adapter<CarsListAdapter.CarsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        return CarsViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.cars_row, parent, false))
    }

    override fun getItemCount(): Int {
        var count = 0
        cars?.let{
            count = it.size
        }
        return count
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.bindView(cars?.get(position))
    }

    inner class CarsViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView) {

        fun bindView(car: Car?) = with(itemView){
            tvModel.text = car?.model
            tvPlate.text = car?.plate

            iv_delete.setOnClickListener({
                onDeleteListener(adapterPosition)
            })

            iv_edit.setOnClickListener({
                onUpdateListener(adapterPosition)
            })
        }

    }

}
