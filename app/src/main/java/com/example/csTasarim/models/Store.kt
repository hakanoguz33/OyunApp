package com.example.csTasarim.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Store(
    @SerialName("id")
    val id: Int,
    @SerialName("store")
    val store: StoreX
)