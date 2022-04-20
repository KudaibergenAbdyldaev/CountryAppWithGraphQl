package com.example.countryapp.data.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CountryDto(
    @SerialName("name") val name: String,
    @SerialName("capital") val capital: String,
    @SerialName("emoji") val emoji: String,
    @SerialName("currency") val currency: String,
    @SerialName("phone") val phone: Int
)