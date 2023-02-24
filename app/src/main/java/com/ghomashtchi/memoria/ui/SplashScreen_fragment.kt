package com.ghomashtchi.memoria.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.ghomashtchi.memoria.ARG_PARAM1
import com.ghomashtchi.memoria.ARG_PARAM2
import com.ghomashtchi.memoria.R
import com.ghomashtchi.memoria.databinding.FragmentSplashScreenBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SplashScreen_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SplashScreen_fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding : FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.textView.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragement1_to_fragment2)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragement1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SplashScreen_fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}