package com.savelov.filmicpro

import android.app.Application
import com.example.remote_module.DaggerRemoteComponent
import com.example.remote_module.RemoteModule
import com.savelov.filmicpro.di.AppComponent
import com.savelov.filmicpro.di.DaggerAppComponent
import com.savelov.filmicpro.di.modules.DatabaseModule
import com.savelov.filmicpro.di.modules.DomainModule


class App : Application() {
    lateinit var dagger: AppComponent
    val remoteProvider = DaggerRemoteComponent.create()

    override fun onCreate() {
        super.onCreate()
        instance = this

        dagger = DaggerAppComponent.builder()
            .remoteProvider(remoteProvider)
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}