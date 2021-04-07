package com.savelov.filmicpro.di

import com.savelov.filmicpro.di.modules.DatabaseModule
import com.savelov.filmicpro.di.modules.DomainModule
import com.savelov.filmicpro.di.modules.RemoteModule
import com.savelov.filmicpro.viewmodel.HomeFragmentViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    modules = [
        RemoteModule::class,
        DatabaseModule::class,
        DomainModule::class
    ]
)
interface AppComponent {
    //метод для того, чтобы появилась внедрять зависимости в HomeFragmentViewModel
    fun inject(homeFragmentViewModel: HomeFragmentViewModel)
}