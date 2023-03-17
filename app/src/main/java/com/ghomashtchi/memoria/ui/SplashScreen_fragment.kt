package com.ghomashtchi.memoria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ghomashtchi.memoria.R
import com.ghomashtchi.memoria.databinding.FragmentSplashScreenBinding

class SplashScreen_fragment : Fragment() {

    private var _binding : FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.logInBackroundImage.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragement1_to_fragment2)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}