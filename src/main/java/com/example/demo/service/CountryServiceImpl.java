package com.example.demo.service;

import com.example.demo.entity.Country;
import com.example.demo.entity.Department;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> fetchCountryList() {
        return countryRepository.findAll();
    }

    @Override
    public void deleteCountrytById(Long countryId) {
        countryRepository.deleteById(countryId);
    }

    @Override
    public Country updateCountryId(Long countryId, Country country) {
        Country couDB = countryRepository.findById(countryId).get();

        if (Objects.nonNull(country.getCountryName()) &
                !"".equalsIgnoreCase(country.getCountryName())) {
            couDB.setCountryName(country.getCountryName());
        }
        if (Objects.nonNull(country.getCountryCode()) &
                !"".equalsIgnoreCase(country.getCountryCode())) {
            couDB.setCountryCode(country.getCountryCode());
        }
       return countryRepository.save(couDB);
    }


}
