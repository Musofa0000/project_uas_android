package com.tofa.Villa_1412200037.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tofa.Villa_1412200037.R
import com.tofa.Villa_1412200037.model.Villa

class VillaListAdapter(
    private val onItemClickListener : (Villa) -> Unit
):ListAdapter<Villa,VillaListAdapter.VillaViewHolder>(WORDS_COMPARATOR) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VillaViewHolder {
        return VillaViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: VillaViewHolder, position: Int) {
        val villa = getItem(position)
        holder.bind(villa)
        holder.itemView.setOnClickListener {
            onItemClickListener(villa)
        }

    }
    class VillaViewHolder (itemView:View): RecyclerView.ViewHolder(itemView) {
        private val nameTextView : TextView = itemView.findViewById(R.id.namaTextView)
        private val addressTextView : TextView = itemView.findViewById(R.id.addresTextView)
        private val capacityTextView : TextView = itemView.findViewById(R.id.capacityTextView)
        fun bind(villa: Villa?) {
            nameTextView.text = villa?.name
            addressTextView.text = villa?.address
            capacityTextView.text = villa?.capacity




        }

        companion object {
            fun create(parent: ViewGroup): VillaListAdapter.VillaViewHolder {
                val view:View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_villa,parent,false)
                return VillaViewHolder(view)
            }
        }


    }
    companion object{
        private val WORDS_COMPARATOR = object : DiffUtil.ItemCallback<Villa>(){
            override fun areContentsTheSame(oldItem: Villa, newItem: Villa): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: Villa, newItem: Villa): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }

}