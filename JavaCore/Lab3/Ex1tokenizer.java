package com.labbook;
import java.util.*;

public class Ex1tokenizer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number with one space : ");
		String num=sc.nextLine();
		int n,sum=0;
		 StringTokenizer st = new StringTokenizer(num, " ");  
	     while (st.hasMoreTokens()) {  
	    	 String temp=st.nextToken();
	    	 n=Integer.parseInt(temp);
	         System.out.println("Integer is : "+n);
	         sum=sum+n;
	     } 
	     System.out.println("sum is : "+sum);
		
		
	}

}
