package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service  // Marks this class as a service component
public class CountryService {

    @Autowired  // Injects the repository dependency
    private CountryRepository countryRepository;

    @Transactional(readOnly = true)  // Ensures method runs in a transactional context
    public List<Country> getAllCountries() {
        return countryRepository.findAll();  // Fetch all countries from DB
    }
}
