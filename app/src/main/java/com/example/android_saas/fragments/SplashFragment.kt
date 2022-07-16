package com.example.android_saas.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android_saas.R
import com.example.android_saas.databinding.FragmentHomeBinding
import com.example.android_saas.databinding.FragmentSplashBinding
import com.example.android_saas.manager.AuthManager


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        Handler(Looper.myLooper()!!).postDelayed({
            when{
                AuthManager.isAuthorized ->{
                    findNavController().navigate(R.id.action_splashFragment_to_mainFlowFragment)
                }

                !AuthManager.isAuthorized ->{
                    findNavController().navigate(R.id.action_splashFragment_to_loginFlowFragment)
                }
            }
        },1000)

        return view
    }

}