package com.ghomashtchi.memoria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ghomashtchi.memoria.R
import com.ghomashtchi.memoria.databinding.FragmentLogInBinding

class LogIn_Fragment : Fragment() {

    private var _binding : FragmentLogInBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLogInBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.loginLoginButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_logIn_Fragment_to_hausapothekefragment)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}