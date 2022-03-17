package com.example.csTasarim.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Post(
    @SerialName("count")
    val count: Int = 0,
    @SerialName("description")
    val description: String = "",
    @SerialName("results")
    var results: List<Result>,
)