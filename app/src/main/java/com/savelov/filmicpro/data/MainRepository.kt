package com.savelov.filmicpro.data

import android.content.ContentValues
import android.database.Cursor
import androidx.lifecycle.LiveData
import com.savelov.filmicpro.data.DAO.FilmDao
import com.savelov.filmicpro.data.db.DatabaseHelper
import com.savelov.filmicpro.data.Entity.Film
import java.util.concurrent.Executors

class MainRepository(private val filmDao: FilmDao) {

    fun putToDb(films: List<Film>) {
        //Запросы в БД должны быть в отдельном потоке
        Executors.newSingleThreadExecutor().execute {
            filmDao.insertAll(films)
        }
    }

    fun getAllFromDB(): LiveData<List<Film>> = filmDao.getCachedFilms()

}

