package com.example.csTasarim.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlatformX(
    @SerialName("platform")
    val platform: PlatformXX,
    @SerialName("released_at")
    val releasedAt: String,
    @SerialName("requirements_en")
    val requirementsEn: Any,
    @SerialName("requirements_ru")
    val requirementsRu: Any
)