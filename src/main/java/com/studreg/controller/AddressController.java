package com.studreg.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studreg.entity.Address;
import com.studreg.repo.AddressRepository;
import com.studreg.repo.CountryRepository;

@RestController
@RequestMapping("/student/secure/address")
public class AddressController {
    
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CountryRepository countryRepository;
    
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Address address) {
        addressRepository.save(address);
    }
    
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Address address) {
        addressRepository.save(address);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{city}")
    public List<Address> get(@PathVariable String city) {
        return addressRepository.findByCity(city);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable String id) {
        addressRepository.deleteById(id);
    }
    
}
