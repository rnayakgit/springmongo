package com.spring.mongo.application;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoCustomRepository extends MongoRepository<EmployeeModel, Long> {

}
