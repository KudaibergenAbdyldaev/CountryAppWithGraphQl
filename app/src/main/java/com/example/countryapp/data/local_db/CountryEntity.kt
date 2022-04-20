package com.example.countryapp.data.local_db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "countries")
data class CountryEntity(
    @PrimaryKey
    val name: String,
    val capital: String,
    val emoji: String,
    val currency: String,
    val phone: Int
)