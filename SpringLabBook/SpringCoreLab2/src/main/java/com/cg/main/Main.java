package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.config.MyConfig;
import com.cg.entities.Employee;
import com.cg.entities.Sbu;

//Presentation layer would be responsible for handling all user interface and browser communication logic.

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee emp = (Employee) context.getBean(Employee.class);
		Sbu sbu = (Sbu) context.getBean(Sbu.class);
		Sbu sbuObject = emp.getSbuDetails();
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("EMPLOYEE:" + emp);
		System.out.println("SBU DETAILS:" + sbuObject);
	}

}
