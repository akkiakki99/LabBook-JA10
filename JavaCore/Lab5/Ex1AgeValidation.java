package com.capg.Lab5;

import java.util.Scanner;
class AgeException extends Exception {
	 
	 public AgeException(String str) {
	  super(str);
	 }
	}
	public class Ex1AgeValidation {
	 
	 public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter your Age ");
	  int age = s.nextInt();
	  s.close();
	  try {
	   if(age < 15) 
	    throw new AgeException("Invalid Age");
	   else
	    System.out.println("Valid Age");
	  }
	  catch (AgeException e) {
	   System.out.println(e);
	  }
	 }
	}
