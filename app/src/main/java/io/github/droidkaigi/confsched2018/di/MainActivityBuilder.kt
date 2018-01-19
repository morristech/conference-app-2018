package io.github.droidkaigi.confsched2018.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.droidkaigi.confsched2018.presentation.MainActivity

@Module interface MainActivityBuilder {
    @ContributesAndroidInjector(
            modules = [
                FragmentBuildersModule::class,
                MainActivityModule::class
            ]
    )
    fun contributeMainActivity(): MainActivity
}
