package com.example.countryapp.domain

interface CountryRepository {
    suspend fun getCountries(): List<Country>
}