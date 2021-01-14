package com.fr1x3.cryptocurrency.ui.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fr1x3.cryptocurrency.repository.CoinRepository

class CryptoListViewModelFactory(
    val app: Application,
    val repository: CoinRepository
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CryptoListViewModel(app, repository) as T
    }

}