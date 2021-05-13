package com.savelov.filmicpro.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.savelov.filmicpro.data.DAO.FilmDao
import com.savelov.filmicpro.data.Entity.Film

@Database(entities = [Film::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao
}