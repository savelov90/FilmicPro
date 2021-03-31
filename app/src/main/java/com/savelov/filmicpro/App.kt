package com.savelov.filmicpro

import android.app.Application
import com.savelov.filmicpro.data.API.ApiConstants
import com.savelov.filmicpro.data.API.TmdbApi
import com.savelov.filmicpro.data.MainRepository
import com.savelov.filmicpro.di.DI
import com.savelov.filmicpro.domain.Interactor

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            //Прикрепляем контекст
            androidContext(this@App)
            //(Опционально) подключаем зависимость
            androidLogger()
            //Инициализируем модули
            modules(listOf(DI.mainModule))
        }
    }
}