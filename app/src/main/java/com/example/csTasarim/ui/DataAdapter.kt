package com.example.csTasarim.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.csTasarim.R
import com.example.csTasarim.models.Post
import kotlinx.android.synthetic.main.list_item_card.view.*

class DataAdapter(private var dataList: Post) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val textView: TextView = itemView.textviewisim
        val textView2: TextView = itemView.textviewrating
        val textView3: TextView = itemView.textviewtarih
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_item_card, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataList.results[position]

        holder.imageView.load(dataModel.backgroundImage) {
            placeholder(R.drawable.ic_launcher_background)
        }
        holder.textView.text = dataModel.name
        holder.textView2.text = dataModel.rating.toString()
        holder.textView3.text = dataModel.released
    }

    override fun getItemCount() = dataList.results.size
}