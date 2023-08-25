package com.bimabagaskhoro.moviekmm.util

import com.bimabagaskhoro.moviekmm.di.getSharedModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(getSharedModule())
    }
}