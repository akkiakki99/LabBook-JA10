package com.capg.Lab9;

import java.util.function.BiFunction;

public class Ex3LambdaFun {

	public static void main(String args[])
	{
		String S1 = "Admin";
		String S2 = "12345";
		
		BiFunction<String,String,Boolean> f1 = (s1,s2) -> {boolean bool;
		if(S1.equals(s1) && S2.equals(S2)) bool = true; else bool = false;
		return bool;};
		
		boolean result = f1.apply("Admin", "12345");
		System.out.println(result);
	}
}
