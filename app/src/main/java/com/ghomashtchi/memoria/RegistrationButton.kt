package com.ghomashtchi.memoria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ghomashtchi.memoria.databinding.FragmentRegistrationButtonBinding

class RegistrationButton : Fragment() {

    private var _binding: FragmentRegistrationButtonBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegistrationButtonBinding.inflate(inflater,container,false)
        val view = binding.root


    }
}