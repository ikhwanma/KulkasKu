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

class DrinkAdapter(private val listDrink: ArrayList<Drink>) : RecyclerView.Adapter<DrinkAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_drink, parent, false)
        return ListViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val drink = listDrink[position]
        Glide.with(holder.itemView.context).load(drink.image).into(holder.imgDrink)
        holder.tvName.text = drink.name
        holder.tvPrice.text = "Rp ${drink.price}"
        holder.tvTag.text = "\"${drink.tagline}\""
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listDrink[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listDrink.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_nama_minuman)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_harga_minuman)
        var tvTag: TextView = itemView.findViewById(R.id.tv_tag_minuman)
        var imgDrink: ImageView = itemView.findViewById(R.id.img_drink)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Drink)
    }
}