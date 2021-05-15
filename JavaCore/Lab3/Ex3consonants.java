package com.labbook;

import java.util.Scanner;

public class Ex3consonants {

	public String getImage(char[] str) {
		 for (int i = 0; i < str.length; i++) 
	        {
			 
		if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i'
                || str[i] == 'o' || str[i] == 'u') {
			continue;
}
		else
		{
		      str[i]=  (char) (str[i]+1);
		}
		
	        } 
        return String.valueOf(str);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String : ");
		String str=sc.nextLine();
		
		sc.close();
		Ex3consonants m= new Ex3consonants();
		String res=m.getImage(str.toLowerCase().toCharArray());
		System.out.println("The String is : "+res.toUpperCase());
		
	}
}
