package com.savelov.filmicpro.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.savelov.filmicpro.App
import com.savelov.filmicpro.data.Entity.Film
import com.savelov.filmicpro.domain.Interactor
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.BehaviorSubject
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import java.util.concurrent.Executors
import javax.inject.Inject

class HomeFragmentViewModel : ViewModel() {



    //Инициализируем интерактор
    @Inject
    lateinit var interactor: Interactor
    val filmsListData: Observable<List<Film>>
    val showProgressBar: BehaviorSubject<Boolean>

    init {
        App.instance.dagger.inject(this)
        filmsListData = interactor.getFilmsFromDB()
        showProgressBar = interactor.progressBarState
        getFilms()
    }

    fun getFilms() {
        interactor.getFilmsFromApi(1)
    }

    fun getSearchResult(search: String) = interactor.getSearchResultFromApi(search)


    interface ApiCallback {
        fun onSuccess()
        fun onFailure()
    }
}