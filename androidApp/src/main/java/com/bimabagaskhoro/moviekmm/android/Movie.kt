package com.bimabagaskhoro.moviekmm.android

import android.app.Application
import com.bimabagaskhoro.moviekmm.android.di.appModule
import com.bimabagaskhoro.moviekmm.di.getSharedModule
import org.koin.core.context.startKoin

class Movie : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModule())
        }
    }
}