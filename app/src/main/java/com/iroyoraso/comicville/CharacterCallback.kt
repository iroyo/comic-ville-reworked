package com.iroyoraso.comicville

import androidx.recyclerview.widget.DiffUtil
import com.iroyoraso.comicville.connector.model.Character

/**
 * Created by iroyo on 2019-09-20.
 * Mail: iroyoraso@gmail.com
 */
object CharacterCallback : DiffUtil.ItemCallback<Character>() {

    override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem.equals(newItem)
    }
}