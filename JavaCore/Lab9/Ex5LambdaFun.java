package com.capg.Lab9;

import java.util.function.Function;

class Fact{
	int  calcFact(int a)
	{
		int accum = 1;
		for(int i =1;i<=a;i++)
			accum *= i;
		return accum;
	}
}
public class Ex5LambdaFun {

	public static void main(String[] args) {
		
		Function<Integer,Integer> fun = new Fact():: calcFact;
           int res = fun.apply(10);
           System.out.println(res);
	}

}
