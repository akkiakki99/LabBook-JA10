package com.capg.Lab9;

import java.util.function.Consumer;

public class Ex2LambdaFun {

	public static void main(String[] args) {
		
      Consumer<String> up = (str) -> {for(int i = 0;i<str.length();i++) System.out.print(str.charAt(i) + " ");};
	  up.accept("abc");
	}

}
