package com.fr1x3.cryptocurrency.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fr1x3.cryptocurrency.R
import com.fr1x3.cryptocurrency.ui.viewmodels.CryptoListViewModel

class CryptoListFragment : Fragment() {

    companion object {
        fun newInstance() = CryptoListFragment()
    }

    private lateinit var viewModel: CryptoListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.crypto_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CryptoListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}