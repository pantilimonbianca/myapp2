package com.example.myanimelist


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myanimelist.model.AnimeName


class AnimeAdapter( val dataset: List<AnimeName> ): RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>(){
    class AnimeViewHolder(view:View): RecyclerView.ViewHolder(view){
        val animeName: TextView = view.findViewById(R.id.anime_name)
        val animeNumberEp: TextView= view.findViewById(R.id.anime_number_ep)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val animeAdapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.animename, parent,false)
        return AnimeViewHolder(animeAdapterLayout)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.animeName.text= dataset[position].animeName
        holder.animeNumberEp.text= dataset[position].animeNumberEp


    }

    override fun getItemCount(): Int {
        return dataset.size

    }
}