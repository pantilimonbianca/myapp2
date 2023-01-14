package com.example.myanimelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myanimelist.databinding.FragmentFourthBinding
import com.example.myanimelist.model.AnimeName


class FourthFragment : Fragment() {

    private lateinit var animeListView: RecyclerView
    private lateinit var dataset: List<AnimeName>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fourth, container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        animeListView= view.findViewById(R.id.anime_list_fragment) as RecyclerView
        dataset= Datasource.loadData()

        val adapter= AnimeAdapter(dataset)
        animeListView.adapter= adapter
        animeListView.layoutManager= LinearLayoutManager(view.context)

    }


}