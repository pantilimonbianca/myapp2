package com.example.myanimelist.data

import com.example.myanimelist.R
import com.example.myanimelist.model.AnimeName

class Datasource{
    companion object {

        private val animeList = mutableListOf<AnimeName>(
            AnimeName( R.drawable.naruto,"Naruto", "episodi: 700"),
            AnimeName( R.drawable.img,"One piece", "episodi: +1050"),
            AnimeName(R.drawable.dragonball,"Dragonball", "episodi: 400"),
            AnimeName(R.drawable.erased,"Erased","episodi: 24"),
            AnimeName(R.drawable.steins,"Steins;Gate","episodi: 38")
        )

        fun loadData(): List<AnimeName> {
            return animeList
        }

    }
}
