package com.practice.navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.practice.navigationcomponent.R
import com.practice.navigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home)
{
   private lateinit var binding:FragmentHomeBinding;
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        binding.btnLogin.setOnClickListener(View.OnClickListener {
          val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment();
            findNavController().navigate(action)
        })
    }

}