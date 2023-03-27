package com.ghomashtchi.memoria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ghomashtchi.memoria.databinding.FragmentProduktBesschreibungBinding

class ProduktBesschreibungFragment : Fragment() {

    private var _binding: FragmentProduktBesschreibungBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProduktBesschreibungBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}