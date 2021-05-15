package com.capg.Lab9;

interface Sayable{  
    void say();  
}  
public class Ex4LambdaFun {  
	private String S1;
	
    public Ex4LambdaFun(String s1) {
		super();
		S1 = s1;
	}
    
	public String getS1() {
		return S1;
	}

	public void setS1(String s1) {
		S1 = s1;
	}

	public static void saySomething(){  
		Ex4LambdaFun e1 = new Ex4LambdaFun("Hello World");
        System.out.println(e1.getS1());  
    }  
    public static void main(String[] args) {  
 
        Sayable sayable = Ex4LambdaFun::saySomething;  
          
        sayable.say();  
    }  
}  
