package com.savelov.filmicpro.domain

import com.savelov.filmicpro.data.MainRepository

class Interactor(val repo: MainRepository) {
    fun getFilmsDB(): List<Film> = repo.filmsDataBase
}