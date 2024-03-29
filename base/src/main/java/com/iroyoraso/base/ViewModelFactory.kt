package com.iroyoraso.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by iroyo on 2019-10-14.
 * Mail: iroyoraso@gmail.com
 */
@Suppress("UNCHECKED_CAST")
class ViewModelFactory<VM : ViewModel>(private val creator: () -> VM) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return creator() as T
    }

}