package com.savelov.filmicpro

import android.app.Application
import com.savelov.filmicpro.di.AppComponent
import com.savelov.filmicpro.di.DaggerAppComponent
import com.savelov.filmicpro.di.modules.DatabaseModule
import com.savelov.filmicpro.di.modules.DomainModule
import com.savelov.filmicpro.di.modules.RemoteModule


class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.builder()
            .remoteModule(RemoteModule())
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}