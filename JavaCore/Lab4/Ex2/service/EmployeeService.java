package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	Employee getEmployee(int id , String name, double salary, String designation, String insurancescheme);
	void findinsuranceScheme(Employee emp);
	void displayEmpDetails(Employee emp);
	
}
