package com.spring.mongo.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MongoController {

	@Autowired
	MongoService service;
	
	
@RequestMapping( value = "/health", method = RequestMethod.GET)
	public ResponseEntity<String>getHealthStatus(){
		return ResponseEntity.ok().body("Status : OK");
	}
	

@RequestMapping( value = "/getEmployees", method = RequestMethod.GET)
public ResponseEntity<List<EmployeePojo>> getEmployees(){
	return ResponseEntity.ok().body(service.getAllEmployee()).getBody();
}

@RequestMapping( value = "/saveEmployee", method = RequestMethod.POST)
public void saveEmployees(@RequestBody EmployeePojo pojo){
	service.saveEmployee(pojo);
}
	
}
