package com.bimabagaskhoro.moviekmm.usecase

import com.bimabagaskhoro.moviekmm.domain.model.Movie
import com.bimabagaskhoro.moviekmm.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetMovieUseCase : KoinComponent {
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(movieId: Int): Movie =
        repository.getMovie(movieId)
}