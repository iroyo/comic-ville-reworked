package com.iroyoraso.characters

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.iroyoraso.base.Dependencies
import com.iroyoraso.base.injectFrom

/**
 * Created by iroyo on 2019-10-14.
 * Mail: iroyoraso@gmail.com
 */
class CharactersListScreen : Fragment(R.layout.characters) {

    private val adapter = CharactersAdapter()

    private val viewModel by injectFrom {
        CharactersViewModel(
            Dependencies.characterRepository
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.list.observe(this, Observer {
            Log.d("ISAAC", "HEY ${it.size}")
            adapter.submitList(it)
        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val charactersList = view.findViewById<RecyclerView>(R.id.character_list)

        charactersList.setHasFixedSize(true)
        charactersList.adapter = adapter
    }

}