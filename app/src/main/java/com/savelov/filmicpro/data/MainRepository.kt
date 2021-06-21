package com.savelov.filmicpro.data

import android.content.ContentValues
import android.database.Cursor
import androidx.lifecycle.LiveData
import com.savelov.filmicpro.data.DAO.FilmDao
import com.savelov.filmicpro.data.db.DatabaseHelper
import com.savelov.filmicpro.data.Entity.Film
import io.reactivex.rxjava3.core.Observable
import kotlinx.coroutines.flow.Flow
import java.util.concurrent.Executors

class MainRepository(private val filmDao: FilmDao) {

    fun putToDb(films: List<Film>) {
        filmDao.insertAll(films)
    }

    fun getAllFromDB(): Observable<List<Film>> = filmDao.getCachedFilms()

}

