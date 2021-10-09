package com.example.kotlin2_1dz.di

import com.example.kotlin2_1dz.data.network.RetrofitClient
import com.example.kotlin2_1dz.data.repository.CharacterRepository
import com.example.kotlin2_1dz.ui.fragment.character.CharacterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val applicationModule = module {
    viewModel { CharacterViewModel(get()) }
}

val repositoriesModule = module {
    factory { CharacterRepository(get()) }
}

val networkModule = module {
    single { RetrofitClient() }
    single { get<RetrofitClient>().providerApiService() }
}