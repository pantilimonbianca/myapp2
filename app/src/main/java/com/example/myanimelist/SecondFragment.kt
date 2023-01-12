package com.example.myanimelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myanimelist.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        setListener()
    }

    private fun setListener(){
        val view = listOf<View>(binding.buttonOneSecondfragment)
        for(item in view){
            item.setOnClickListener{
                buttonReaction(it)
            }
        }
    }

    private fun buttonReaction(it: View) {
        binding.boxSecondSecondFragment.visibility = View.VISIBLE
        when (it.id) {
            R.id.button_one_secondfragment -> binding.boxSecondSecondFragment.text ="Errore. Ritenta più tardi"

        }

    }
}