package com.fr1x3.cryptocurrency.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.fr1x3.cryptocurrency.R
import com.fr1x3.cryptocurrency.repository.CoinRepository
import com.fr1x3.cryptocurrency.ui.viewmodels.CryptoListViewModel
import com.fr1x3.cryptocurrency.ui.viewmodels.CryptoListViewModelFactory

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}