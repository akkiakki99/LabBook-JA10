package com.capg.lab4;

public class SavingAccounts extends Ex1Accounts
{   private final int minBalance = 500;
    
public SavingAccounts(double balance, Person accHolder) {
		super(balance, accHolder);
	}

void withdraw(double balance,SavingAccounts Acc)
  {
	double currentbalance = Acc.getBalance();
  	double updatedbalance = currentbalance - balance;
  	if(updatedbalance>minBalance)
  	   Acc.setBalance(updatedbalance);
  	else
  	   System.out.println("Insufficient balance");
  }

}
