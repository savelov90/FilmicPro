package com.savelov.filmicpro.di.modules

import com.savelov.filmicpro.data.API.TmdbApi
import com.savelov.filmicpro.data.MainRepository
import com.savelov.filmicpro.domain.Interactor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DomainModule {
    @Singleton
    @Provides
    fun provideInteractor(repository: MainRepository, tmdbApi: TmdbApi) = Interactor(repo = repository, retrofitService = tmdbApi)
}