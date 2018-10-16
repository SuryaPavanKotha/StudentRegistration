package com.studreg.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studreg.entity.UserTest;

//@Repository
public interface UserRespositoryTest {
//public interface UserRespositoryTest extends MongoRepository<UserTest, String> {

    public UserTest findOneByFirstName(String name);


}
