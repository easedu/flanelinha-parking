package br.com.flanelinha.falanelinhaparking.cars.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class CarsListAdapter(
    private val context: Context,
    private val cars: List<Car>,
    private val onItemListClick: (adapterPosition: Int) -> Unit,
    private val onItemListLongClick: (adapterPosition: Int) -> Unit
) :
    RecyclerView.Adapter<CarsListAdapter.CarsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.cars_row, parent, false)
        return CarsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.bindView(cars[position])
    }

    inner class CarsViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        fun bindView(car: Car?) = with(itemView){
            tvModel.text = car?.model
            tvPlate.text = car?.plate

            itemView.setOnClickListener({
                onItemListClick(adapterPosition)
            })

            itemView.setOnLongClickListener({ view ->
                onItemListLongClick(adapterPosition)
                false
            })
        }

    }

}
