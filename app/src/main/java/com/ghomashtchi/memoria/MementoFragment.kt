package com.ghomashtchi.memoria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ghomashtchi.memoria.databinding.FragmentMementoBinding

class MementoFragment : Fragment() {

    private var _binding: FragmentMementoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_memento, container, false)
    }
}
