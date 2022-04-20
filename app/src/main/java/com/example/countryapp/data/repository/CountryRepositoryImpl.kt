package com.example.countryapp.data.repository

import com.example.countryapp.domain.Country
import com.example.countryapp.domain.CountryRepository

class CountryRepositoryImpl: CountryRepository {
    override suspend fun getCountries(): List<Country> {
        TODO("Not yet implemented")
    }
}