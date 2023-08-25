package com.bimabagaskhoro.moviekmm.data.remote

import com.bimabagaskhoro.moviekmm.util.Constant
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.parameter
import io.ktor.http.path
import io.ktor.http.takeFrom
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

internal abstract class KtorApi {
    val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    fun HttpRequestBuilder.pathUrl(path: String) {
        url {
            takeFrom(Constant.BASE_URL)
            path(Constant.PATH_INT, path)
            parameter(Constant.PARAM_API_KEY, Constant.API_KEY)
        }
    }
}