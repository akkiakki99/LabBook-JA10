package com.labbook;

import java.util.Scanner;

public class Ex2mirror {
	public String getImage(String str) {
		StringBuffer sb=new StringBuffer(str);  
	    sb.reverse();  
        return sb.toString();
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String : ");
		String str=sc.nextLine();
		
		Ex2mirror m= new Ex2mirror();
		String res=m.getImage(str);
		System.out.println("The String is : "+str+"|"+res);
		
	}

}
