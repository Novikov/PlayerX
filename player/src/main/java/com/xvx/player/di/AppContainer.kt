package com.xvx.player.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.xvx.player.PlayerViewModel

internal class AppContainer(private val context: Context) {

    fun provideViewModel(owner: ViewModelStoreOwner): PlayerViewModel {
        return ViewModelProvider(
            owner,
            ViewModelProvideFactory(context.toString())
        )[PlayerViewModel::class.java]
    }
}
