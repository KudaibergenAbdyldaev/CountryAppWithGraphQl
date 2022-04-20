package com.example.countryapp.domain

interface CountryRepository {
    fun getCountries(): List<Country>
}