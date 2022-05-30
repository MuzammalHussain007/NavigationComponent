package com.practice.navigationcomponent.fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.practice.navigationcomponent.R
import com.practice.navigationcomponent.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {
    private lateinit var binding: FragmentWelcomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args : WelcomeFragmentArgs by navArgs()
        binding = FragmentWelcomeBinding.bind(view)
        binding.username.text = args.email

    }

}