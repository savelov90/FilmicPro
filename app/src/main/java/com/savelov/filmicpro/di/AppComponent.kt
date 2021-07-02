package com.savelov.filmicpro.di

import com.example.remote_module.RemoteModule
import com.example.remote_module.RemoteProvider
import com.savelov.filmicpro.di.modules.DatabaseModule
import com.savelov.filmicpro.di.modules.DomainModule
import com.savelov.filmicpro.viewmodel.HomeFragmentViewModel
import com.savelov.filmicpro.viewmodel.SettingsFragmentViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    dependencies = [RemoteProvider::class],
    modules = [
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