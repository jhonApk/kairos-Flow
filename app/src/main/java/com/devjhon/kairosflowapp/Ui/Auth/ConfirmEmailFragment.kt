package com.devjhon.kairosflowapp.Ui.Auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.devjhon.kairosflowapp.R
import com.devjhon.kairosflowapp.databinding.FragmentConfirmEmailBinding

class ConfirmEmailFragment : Fragment() {


    private lateinit var binding: FragmentConfirmEmailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentConfirmEmailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnVoltarConfirmEmail.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnCancelarConfirmEmail.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }

        binding.btnEnviarLink.setOnClickListener {
            findNavController().navigate(R.id.novaSenhaFragment)
        }


    }


}