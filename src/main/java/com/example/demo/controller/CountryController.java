package com.example.demo.controller;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;

    @PostMapping("/country")
    public Country saveCountry(@RequestBody Country country){
      return countryService.saveCountry(country);
    }
    @GetMapping("/country")
    public List<Country> fetchCountryList(){
        return countryService.fetchCountryList();
    }

}

