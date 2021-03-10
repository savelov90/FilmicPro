package com.savelov.filmicpro.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.savelov.filmicpro.App
import com.savelov.filmicpro.domain.Film
import com.savelov.filmicpro.domain.Interactor

class HomeFragmentViewModel : ViewModel() {

    val filmsListLiveData = MutableLiveData<List<Film>>()
    private var interactor: Interactor = App.instance.interactor

    init {
        val films = interactor.getFilmsDB()
        filmsListLiveData.postValue(films)
    }
}