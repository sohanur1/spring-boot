package com.example.demo.service;

import com.example.demo.entity.Country;

import java.util.List;

public interface CountryService {


    Country saveCountry(Country country);

    List<Country> fetchCountryList();


    void deleteCountrytById(Long countryId);

    Country updateCountryId(Long countryId, Country country);
}
