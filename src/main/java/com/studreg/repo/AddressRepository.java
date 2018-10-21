package com.studreg.repo;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.studreg.entity.Address;

public interface AddressRepository extends MongoRepository<Address, String>{
   
    public List<Address> findByCity(String city);
}
