package com.ghomashtchi.memoria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
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

        binding.buttonAddButton.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_produktBesschreibungFragment_to_hausapothekefragment)
        }
        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}