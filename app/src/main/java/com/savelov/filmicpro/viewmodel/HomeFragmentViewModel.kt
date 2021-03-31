package com.savelov.filmicpro.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.savelov.filmicpro.App
import com.savelov.filmicpro.domain.Film
import com.savelov.filmicpro.domain.Interactor
import org.koin.core.KoinComponent
import org.koin.core.inject

class HomeFragmentViewModel : ViewModel(), KoinComponent {
    val filmsListLiveData:  MutableLiveData<List<Film>> = MutableLiveData()
    //Инициализируем интерактор
    private val interactor: Interactor by inject()

    init {
        interactor.getFilmsFromApi(1, object : ApiCallback {
            override fun onSuccess(films: List<Film>) {
                filmsListLiveData.postValue(films)
            }

            override fun onFailure() {
            }
        })
    }

    interface ApiCallback {
        fun onSuccess(films: List<Film>)
        fun onFailure()
    }
}