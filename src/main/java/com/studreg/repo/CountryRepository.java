package com.studreg.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.studreg.entity.Country;

public interface CountryRepository extends MongoRepository<Country, String>{
    public List<Country> findByCountryName(String CountryName);

}
