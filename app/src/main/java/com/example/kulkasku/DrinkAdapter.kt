package com.example.kulkasku

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.kulkasku.databinding.ItemListDrinkBinding

class DrinkAdapter(private val listDrink: ArrayList<Drink>) : RecyclerView.Adapter<DrinkAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemListDrinkBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val drink = listDrink[position]
        Glide.with(holder.itemView.context).load(drink.image).into(holder.binding.imgDrink)
        holder.binding.tvNamaMinuman.text = drink.name
        holder.binding.tvHargaMinuman.text = "Rp ${drink.price}"
        holder.binding.tvTagMinuman.text = "\"${drink.tagline}\""
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listDrink[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listDrink.size
    }

    inner class ListViewHolder(var binding: ItemListDrinkBinding) : RecyclerView.ViewHolder(binding.root)

    interface OnItemClickCallback {
        fun onItemClicked(data: Drink)
    }
}