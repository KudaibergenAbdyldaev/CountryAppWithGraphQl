package com.example.countryapp.data.mapper

import com.example.countryapp.data.network.CountryDto
import com.example.countryapp.domain.Country
import javax.inject.Inject

class CountryMapper @Inject constructor() {

    fun mapCountryDtoToCountry(dto: CountryDto): Country {
        return Country(dto.name, dto.capital, dto.emoji, dto.currency, dto.phone)
    }

}