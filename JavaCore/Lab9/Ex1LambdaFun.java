package com.capg.Lab9;

import java.util.function.BiFunction;

public class Ex1LambdaFun {

	public static void main(String args[])
	{
		BiFunction<Integer,Integer,Integer> func = (x1,x2) -> (int)Math.pow(x1,x2);
	    Integer result = func.apply(2, 3);
	    System.out.println(result);
	}
}
