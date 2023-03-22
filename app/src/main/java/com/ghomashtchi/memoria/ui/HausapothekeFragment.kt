package com.ghomashtchi.memoria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ghomashtchi.memoria.databinding.FragmentHausapothekeBinding

class Hausapothekefragment : Fragment() {

    private lateinit var binding: FragmentHausapothekeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHausapothekeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // CODE HERE set onClickListener for the button
    }
}

