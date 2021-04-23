package com.savelov.filmicpro.di

import com.savelov.filmicpro.di.modules.DatabaseModule
import com.savelov.filmicpro.di.modules.DomainModule
import com.savelov.filmicpro.di.modules.RemoteModule
import com.savelov.filmicpro.viewmodel.HomeFragmentViewModel
import com.savelov.filmicpro.viewmodel.SettingsFragmentViewModel
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
    //метод для того, чтобы появилась возможность внедрять зависимости в HomeFragmentViewModel
    fun inject(homeFragmentViewModel: HomeFragmentViewModel)
    //метод для того, чтобы появилась возможность внедрять зависимости в SettingsFragmentViewModel
    fun inject(settingsFragmentViewModel: SettingsFragmentViewModel)
}