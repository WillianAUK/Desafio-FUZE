package com.primeiro.desafio_fuze.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.primeiro.desafio_fuze.util.DataHistoric
import com.primeiro.desafio_fuze.R
import kotlinx.android.synthetic.main.historic.view.*


/*
Classe adapter para o o hitórico ser mostrado no recyclerView da tela inicial
 */
class ViewHistoricAdapter (val searchs: MutableList<DataHistoric.ViewHistoricText>):
    RecyclerView.Adapter<ViewHistoricAdapter.ViewHistoricDataViewHolder>(){


        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): ViewHistoricAdapter.ViewHistoricDataViewHolder {

            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.historic, parent, false)
            return ViewHistoricDataViewHolder(view)
        }

        override fun getItemCount(): Int = searchs.size

        override fun onBindViewHolder(
            holder: ViewHistoricAdapter.ViewHistoricDataViewHolder,
            position: Int
        ) {
            holder.bind(searchs[position])
        }

        inner class ViewHistoricDataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            fun bind(search: DataHistoric.ViewHistoricText) {
                itemView.text_search.text = search.text_
            }
        }

}