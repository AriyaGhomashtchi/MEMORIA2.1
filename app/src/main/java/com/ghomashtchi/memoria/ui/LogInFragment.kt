package com.ghomashtchi.memoria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.ghomashtchi.memoria.R
import com.ghomashtchi.memoria.databinding.FragmentLogInBinding

class LogInfragment : Fragment() {

    private lateinit var binding: FragmentLogInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLogInBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.loginLoginButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_hausapotheke_fragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       binding.loginLoginButton.setOnClickListener {
           findNavController()
               .navigate(R.id.action_fragment2_to_hausapotheke_fragment)
       }
    }
}