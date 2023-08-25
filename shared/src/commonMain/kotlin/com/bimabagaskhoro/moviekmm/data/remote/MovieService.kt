package com.bimabagaskhoro.moviekmm.data.remote

import com.bimabagaskhoro.moviekmm.util.Constant
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

internal class MovieService : KtorApi() {

    //get all movie
    suspend fun getMovies(page: Int = 1): MovieResponse = client.get {
        pathUrl(Constant.MOVIE_POPULAR)
        parameter(Constant.PAGE, page)
    }.body()

    //get detail movie
    suspend fun getMovie(movieId: Int): MovieResponse = client.get {
        pathUrl("movie/${movieId}")
    }.body()
}