package com.devjhon.kairosflowapp.Ui.Auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.devjhon.kairosflowapp.R
import com.devjhon.kairosflowapp.databinding.FragmentRegistroBinding

class RegistroFragment : Fragment() {
    private lateinit var binding: FragmentRegistroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvVoltar.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}