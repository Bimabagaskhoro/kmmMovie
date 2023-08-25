package com.bimabagaskhoro.moviekmm.di

import com.bimabagaskhoro.moviekmm.data.remote.MovieService
import com.bimabagaskhoro.moviekmm.data.remote.RemoteDataSource
import com.bimabagaskhoro.moviekmm.data.repository.MovieRepositoryImpl
import com.bimabagaskhoro.moviekmm.domain.repository.MovieRepository
import com.bimabagaskhoro.moviekmm.usecase.GetMovieUseCase
import com.bimabagaskhoro.moviekmm.usecase.GetMoviesUseCase
import com.bimabagaskhoro.moviekmm.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModule() = sharedModules