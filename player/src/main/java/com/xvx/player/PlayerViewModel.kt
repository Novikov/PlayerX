package com.xvx.player

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

internal class PlayerViewModel(private val repository: String) : ViewModel() {

    fun testRequest() {
        viewModelScope.launch {
            Log.i("ASDASDASDASDASDASD", "hohohoh")
        }
    }
}
