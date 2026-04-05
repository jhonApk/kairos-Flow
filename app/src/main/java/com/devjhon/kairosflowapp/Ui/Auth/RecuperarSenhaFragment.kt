package com.devjhon.kairosflowapp.Ui.Auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.devjhon.kairosflowapp.R
import com.devjhon.kairosflowapp.databinding.FragmentLoginBinding
import com.devjhon.kairosflowapp.databinding.FragmentRecuperarSenhaBinding
import com.devjhon.kairosflowapp.databinding.FragmentRegistroBinding
import java.util.zip.Inflater

class RecuperarSenhaFragment : Fragment() {

    private lateinit var binding: FragmentRecuperarSenhaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentRecuperarSenhaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvVoltar.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}