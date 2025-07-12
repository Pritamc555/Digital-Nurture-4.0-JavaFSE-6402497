package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countries", List.class);

        // Use Stream & lambda to find country by code, case-insensitive
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findAny()
                .orElse(null); // or throw exception if country not found
    }
}
