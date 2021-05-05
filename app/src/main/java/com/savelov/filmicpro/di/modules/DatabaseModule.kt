package com.savelov.filmicpro.di.modules

import android.content.Context
import com.savelov.filmicpro.data.MainRepository
import com.savelov.filmicpro.data.db.DatabaseHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabaseHelper(context: Context) = DatabaseHelper(context)

    @Provides
    @Singleton
    fun provideRepository(databaseHelper: DatabaseHelper) = MainRepository(databaseHelper)
}