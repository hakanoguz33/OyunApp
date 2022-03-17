package com.example.csTasarim.api

import com.example.csTasarim.models.Post
import retrofit2.http.GET

interface SimpleApi {
    @GET("api/games?key=272c4a2bcddd4912bee79a33a53dcd5b")
    suspend fun getPost() : Post
}