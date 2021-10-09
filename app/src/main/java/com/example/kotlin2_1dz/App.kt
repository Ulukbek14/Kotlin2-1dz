package com.example.kotlin2_1dz

import android.app.Application
import com.example.kotlin2_1dz.di.applicationModule
import com.example.kotlin2_1dz.di.networkModule
import com.example.kotlin2_1dz.di.repositoriesModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                applicationModule, repositoriesModule, networkModule
            )
        }
    }
}