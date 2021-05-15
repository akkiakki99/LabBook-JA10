package com.capg.lab4;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
        String PersonName1 = sc.next();
        System.out.println("Enter Age");
        int PersonAge1 = sc.nextInt();
        System.out.println("Enter deposit value");
        int InitialAmt1 = sc.nextInt();
        
        Person P1 = new Person(PersonName1, PersonAge1);
        SavingAccounts Ac1 = new SavingAccounts(InitialAmt1,P1);
        
        System.out.println("Entered Details are :");
        System.out.println("Account Number :" + Ac1.getAccNum());
        System.out.println("Name :" + Ac1.getAccHolder().getName());
        System.out.println("Age :" + Ac1.getAccHolder().getAge());
        System.out.println("Balance :" +Ac1.getBalance());
        
        System.out.println("Enter name");
        String PersonName2 = sc.next();
        System.out.println("Enter Age");
        int PersonAge2 = sc.nextInt();
        System.out.println("Enter deposit value");
        int InitialAmt2 = sc.nextInt();
        
        Person P2 = new Person(PersonName2, PersonAge2);
        CurrentAccounts Ac2 = new CurrentAccounts(InitialAmt2,P2);
       
        System.out.println("Entered Details are :");
        System.out.println("Account Number :" + Ac2.getAccNum());
        System.out.println("Name :" + Ac2.getAccHolder().getName());
        System.out.println("Age :" + Ac2.getAccHolder().getAge());
        System.out.println("Balance :" +Ac2.getBalance());
        
        System.out.println("Enter the Amount to deposit in Smith Accounts :");
        int Dep_Amt = sc.nextInt();
        
        Ac1.deposit(Dep_Amt, Ac1);
        
        System.out.println("Updated Balance :" +Ac1.getBalance());
        
        System.out.println("Enter the Amount to be withdrawn in Kathy Accounts :");
        int With_Amt = sc.nextInt();
         
        Ac2.withdraw(With_Amt, Ac2);
        
        System.out.println("Updated Balance :" +Ac2.getBalance());
        
        sc.close();
	}

}
