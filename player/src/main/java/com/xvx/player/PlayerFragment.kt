package com.xvx.player

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.xvx.player.di.AppContainer

class PlayerFragment : Fragment(R.layout.player_fragment) {
    private lateinit var appContainer: AppContainer
    private lateinit var viewModel: PlayerViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        appContainer = AppContainer(context)
        viewModel = appContainer.provideViewModel(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            viewModel.testRequest()
        }
    }

    companion object {
        fun newInstance() = PlayerFragment()
    }
}
