package com.savelov.filmicpro.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.savelov.filmicpro.App
import com.savelov.filmicpro.data.Entity.Film
import com.savelov.filmicpro.domain.Interactor
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import java.util.concurrent.Executors
import javax.inject.Inject

class HomeFragmentViewModel : ViewModel() {

    val showProgressBar: Channel<Boolean>

    //Инициализируем интерактор
    @Inject
    lateinit var interactor: Interactor
    val filmsListData: Flow<List<Film>>

    init {
        App.instance.dagger.inject(this)
        filmsListData = interactor.getFilmsFromDB()
        showProgressBar = interactor.progressBarState
        getFilms()
    }

    fun getFilms() {
        interactor.getFilmsFromApi(1)
    }


    interface ApiCallback {
        fun onSuccess()
        fun onFailure()
    }
}