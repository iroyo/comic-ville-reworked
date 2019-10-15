package com.iroyoraso.characters

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.iroyoraso.base.Dependencies
import com.iroyoraso.base.injectFrom

/**
 * Created by iroyo on 2019-10-14.
 * Mail: iroyoraso@gmail.com
 */
class CharactersListScreen : Fragment(R.layout.characters) {

    private val viewModel by injectFrom {
        CharactersViewModel(
            Dependencies.characterRepository
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.list.observe(viewLifecycleOwner, Observer {
            Log.d("ISAAC", "TESTING")
        })

    }

}