package com.bimabagaskhoro.moviekmm.domain.repository

import com.bimabagaskhoro.moviekmm.domain.model.Movie

internal interface MovieRepository {

    suspend fun getMovies(page: Int): List<Movie?>

    suspend fun getMovie(movieId: Int): Movie
}