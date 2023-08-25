package com.bimabagaskhoro.moviekmm.domain.model

data class Movie(
    val id: Int? = 0,
    val title: String? = "",
    val description: String? = "",
    val imageUrl: String? = "",
    val releaseDate: String? = ""
)
