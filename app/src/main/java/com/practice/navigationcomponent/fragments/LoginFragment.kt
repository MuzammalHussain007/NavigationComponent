package com.practice.navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.practice.navigationcomponent.R
import com.practice.navigationcomponent.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        binding.loginbtn.setOnClickListener(View.OnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(binding.email.text.toString())
            findNavController().navigate(action)
        })

    }
    }

