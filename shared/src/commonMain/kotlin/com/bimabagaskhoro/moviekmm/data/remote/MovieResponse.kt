package com.bimabagaskhoro.moviekmm.data.remote

@kotlinx.serialization.Serializable
internal data class MovieResponse(
    val results: List<MovieRemote>
)
