package com.savelov.filmicpro.di.modules

import android.content.Context
import androidx.room.Room
import com.savelov.filmicpro.data.DAO.FilmDao
import com.savelov.filmicpro.data.MainRepository
import com.savelov.filmicpro.data.db.AppDatabase
import com.savelov.filmicpro.data.db.DatabaseHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideFilmDao(context: Context) =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "film_db"
        ).build().filmDao()

    @Provides
    @Singleton
    fun provideRepository(filmDao: FilmDao) = MainRepository(filmDao)
}