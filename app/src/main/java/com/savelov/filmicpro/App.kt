package com.savelov.filmicpro

import android.app.Application
import com.savelov.filmicpro.di.AppComponent
import com.savelov.filmicpro.di.DaggerAppComponent


class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.create()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}