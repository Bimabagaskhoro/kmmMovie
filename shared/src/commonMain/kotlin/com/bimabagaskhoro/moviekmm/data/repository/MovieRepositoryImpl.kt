package com.bimabagaskhoro.moviekmm.data.repository

import com.bimabagaskhoro.moviekmm.data.remote.RemoteDataSource
import com.bimabagaskhoro.moviekmm.data.util.toMovie
import com.bimabagaskhoro.moviekmm.domain.model.Movie
import com.bimabagaskhoro.moviekmm.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> =
        remoteDataSource.getMovies(page).results.map { it.toMovie() }

    override suspend fun getMovie(movieId: Int): Movie =
        remoteDataSource.getMovie(movieId = movieId).results.first().toMovie()

}