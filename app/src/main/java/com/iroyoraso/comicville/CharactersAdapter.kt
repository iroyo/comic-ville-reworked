package com.iroyoraso.comicville

import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.iroyoraso.comicville.CharactersAdapter.CharacterHolder
import com.iroyoraso.comicville.connector.model.Character

/**
 * Created by iroyo on 2019-09-20.
 * Mail: iroyoraso@gmail.com
 */
class CharactersAdapter : PagedListAdapter<Character, CharacterHolder>(CharacterCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: CharacterHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class CharacterHolder(v: View): RecyclerView.ViewHolder(v) {

    }
}