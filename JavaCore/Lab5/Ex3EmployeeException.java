package com.capg.Lab5;

import java.util.Scanner;

class EmployeeExeption extends Exception{
	public EmployeeExeption(String message){
		super(message);
	}
}
public class Ex3EmployeeException {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER  YOUR SALARY");
		int a=obj.nextInt();
		try {
			if(a<3000)
				throw new EmployeeExeption("Your Salary is Below 3000");
			else
				System.out.println("Salary is correct");
		}
		catch(EmployeeExeption c) {
			System.out.println(c.getMessage());
		}
finally {obj.close();}
	}
}