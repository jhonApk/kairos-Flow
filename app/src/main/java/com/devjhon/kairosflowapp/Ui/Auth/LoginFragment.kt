package com.devjhon.kairosflowapp.Ui.Auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.devjhon.kairosflowapp.R
import com.devjhon.kairosflowapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var  binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnCriarConta.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_registro)
        }

        binding.tvEsqueceuSenha.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_recuperar)
        }
    }

}