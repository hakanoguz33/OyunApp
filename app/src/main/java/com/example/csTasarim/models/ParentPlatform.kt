package com.example.csTasarim.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ParentPlatform(
    @SerialName("platform")
    val platform: Platform
)