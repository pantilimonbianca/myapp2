package com.example.myanimelist.data

import com.example.myanimelist.model.AnimeName

class Datasource{
    companion object {

        private val animeList = mutableListOf<AnimeName>(
            AnimeName( "Naruto", "episodi: 700"),
            AnimeName( "One piece", "episodi: +1050"),
            AnimeName("Dragonball", "episodi: 400"),
            AnimeName("Erased","episodi: 24"),
            AnimeName("Steins;Gate","episodi: 38")
        )

        fun loadData(): List<AnimeName> {
            return animeList
        }

    }
}
