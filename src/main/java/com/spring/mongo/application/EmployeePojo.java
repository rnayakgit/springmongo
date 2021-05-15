package com.spring.mongo.application;

import org.springframework.data.annotation.Id;

public class EmployeePojo {
	
private Long empid;
private String empname;
private String id;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

public Long getEmpid() {
	return empid;
}
public void setEmpid(Long empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}




}
