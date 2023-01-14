package com.example.myanimelist

import com.example.myanimelist.model.AnimeName

class Datasource{
    companion object {

        private val animeList = mutableListOf<AnimeName>(
            AnimeName( "Naruto", "700"),
            AnimeName( "One piece", "+1050"),
            AnimeName("Dragonball", "400")
        )

        fun loadData(): List<AnimeName> {
            return animeList
        }

    }
}
