package com.iroyoraso.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

/**
 * Created by iroyo on 2019-10-14.
 * Mail: iroyoraso@gmail.com
 */



inline fun <reified T : ViewModel> FragmentActivity.injectFrom(noinline creator: (() -> T)): Lazy<T> {
    return lazy { ViewModelProviders.of(this, ViewModelFactory(creator)).get(T::class.java) }
}


inline fun <reified T : ViewModel> Fragment.injectFrom(noinline creator: (() -> T)): Lazy<T> {
    return lazy { ViewModelProviders.of(this, ViewModelFactory(creator)).get(T::class.java) }
}