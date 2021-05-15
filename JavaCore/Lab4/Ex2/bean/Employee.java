package com.cg.eis.bean;

public class Employee 
{
  private int Empid;
  private String Empname;
  private double Salary;
  private String Designation;
  private String insuranceScheme;
  
//public Employee(int id, String name, int salary, String designation, char insuranceScheme) {
//	super();
//	Empid = id;
//	Empname = name;
//	Salary = salary;
//	Designation = designation;
//	this.insuranceScheme = insuranceScheme;
//}
  
public int getId() {
	return Empid;
}
public void setId(int id) {
	Empid = id;
}
public String getName() {
	return Empname;
}
public void setName(String name) {
	Empname = name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public String getInsuranceScheme() {
	return insuranceScheme;
}
public void setInsuranceScheme(String insuranceScheme) {
	this.insuranceScheme = insuranceScheme;
}  
}
