package com.xvx.player.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.xvx.player.PlayerViewModel

internal class ViewModelProvideFactory(private val repository: String) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PlayerViewModel(repository) as T
    }
}
