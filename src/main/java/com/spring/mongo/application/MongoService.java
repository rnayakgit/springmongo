package com.spring.mongo.application;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public interface MongoService {
	
	public ResponseEntity<List<EmployeePojo>>getAllEmployee();
	public void saveEmployee(EmployeePojo pojo);

}
