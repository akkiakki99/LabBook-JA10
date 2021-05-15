package com.cg.eis.service;

import com.cg.eis.bean.Employee;
public class EmployeeServiceImpl implements EmployeeService
{
   public Employee getEmployee(int id , String name, double salary, String designation, String insurancescheme)
   {
	   Employee emp = new Employee();
	   emp.setId(id);
	   emp.setName(name);
	   emp.setSalary(salary);
	   emp.setDesignation(designation);
	   emp.setInsuranceScheme(insurancescheme);
	   return emp;
   }
	
   public void findinsuranceScheme(Employee emp)
   {
	   if (emp.getSalary()<5000)
	   {   if(emp.getDesignation().equals("Clerk"))
	        {   
		      emp.setInsuranceScheme("No Scheme");
	        }
	   }
	   else if(emp.getSalary()>5000 && emp.getSalary()<=25000)
	   {
		   if(emp.getDesignation().equals("Developer"))
		   {
			   emp.setInsuranceScheme("Scheme C");
		   }
	   }
	   else if(emp.getSalary()>25000 && emp.getSalary()<=40000)
	   {
		   if(emp.getDesignation().equals("Associate"))
		   {
			   emp.setInsuranceScheme("Scheme B");
		   }
	   }
	   else if(emp.getSalary()>40000)
	   {
		   if(emp.getDesignation().equals("Manager"))
		   {
			   emp.setInsuranceScheme("Scheme A");
		   }
	   }
	   
   }
   
   public void displayEmpDetails(Employee emp)
   {
	   System.out.println("Employee ID :" + emp.getId());
	   System.out.println("Name :" + emp.getName());
	   System.out.println("Salary :" + emp.getSalary());
	   System.out.println("Designation :" + emp.getDesignation());
	   System.out.println("Insurance Scheme :" + emp.getInsuranceScheme());
   }

   
}
