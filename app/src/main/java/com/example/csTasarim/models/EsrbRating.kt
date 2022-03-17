package com.example.csTasarim.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EsrbRating(
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("slug")
    val slug: String
)