package spartons.com.prosmssenderapp.activities.main.fragments.mainScreen.tabFragments.settings.di

import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import spartons.com.prosmssenderapp.activities.main.fragments.mainScreen.tabFragments.settings.viewModel.SettingsFragmentViewModel
import spartons.com.prosmssenderapp.backend.MyCustomApplication


/**
 * Ahsen Saeed}
 * ahsansaeed067@gmail.com}
 * 10/27/19}
 */

val settingsModule = module {

    viewModel { SettingsFragmentViewModel(androidApplication() as MyCustomApplication, get()) }
}