package com.spring.mongo.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class MongoServiceImpl implements MongoService{
	
	@Autowired
	MongoCustomRepository repository;

	public ResponseEntity<List<EmployeePojo>>getAllEmployee(){
		List<EmployeeModel> model= repository.findAll();
		List<EmployeePojo>pojo=new ArrayList<>();
		for(EmployeeModel empmodel:model) {
			EmployeePojo dto=new EmployeePojo();
			dto.setId(empmodel.getId());			
			dto.setEmpid(empmodel.getEmpid());
			dto.setEmpname(empmodel.getEmpname());
			pojo.add(dto);
		}
	 return ResponseEntity.ok().body(pojo);
	}
	
	
	public void saveEmployee(EmployeePojo pojo){
			EmployeeModel model=new EmployeeModel();
			//model.setId(pojo.getId());			
			model.setEmpid(pojo.getEmpid());
			model.setEmpname(pojo.getEmpname());
			repository.save(model);
	}
	
	
	
	
}
