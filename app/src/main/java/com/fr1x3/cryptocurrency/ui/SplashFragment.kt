package com.fr1x3.cryptocurrency.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.fr1x3.cryptocurrency.R

class SplashFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)
        // delay for splash screen to run
        Handler(Looper.getMainLooper()).postDelayed(
            Runnable {
               requireView().findNavController().navigate(R.id.action_splashFragment_to_cryptoListFragment)
            }, 5000
        )

    }
}