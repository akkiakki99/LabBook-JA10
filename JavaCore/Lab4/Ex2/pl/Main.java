package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.*;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id :");
        int empid = sc.nextInt();
        System.out.println("Enter Name");
        String empname = sc.next();
        System.out.println("Enter Salary");
        int empsal = sc.nextInt();
        System.out.println("Enter Designation");
        String empdes = sc.next();

        sc.close();
        
        
        Employee emp;
        EmployeeService ser = new EmployeeServiceImpl();
        String Scheme = null;
        
        emp = ser.getEmployee(empid, empname, empsal, empdes, Scheme);
        ser.findinsuranceScheme(emp);
        System.out.println("Employee Details are : " );
        
        ser.displayEmpDetails(emp);
	}

}
