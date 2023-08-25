package com.bimabagaskhoro.moviekmm.data.remote

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
internal data class MovieRemote(
    @SerialName("id")
    val id: Int? = 0,

    @SerialName("title")
    val title: String? = "",

    @SerialName("overview")
    val overview: String? = "",

    @SerialName("poster_path")
    val posterImage: String? = "",

    @SerialName("release_date")
    val releaseDate: String? = ""
)
