package com.capg.lab4;

public class CurrentAccounts extends Ex1Accounts
{   private final int overDraftLimit = -500;
    
public CurrentAccounts(double balance, Person accHolder) {
		super(balance, accHolder);
	}

void withdraw(double balance,CurrentAccounts Acc)
  {
	double currentbalance = Acc.getBalance();
  	double updatedbalance = currentbalance - balance;
  	if(updatedbalance>overDraftLimit)
  	   Acc.setBalance(updatedbalance);
  	else
  	   System.out.println("OverDraft Limit Exceeded!!");
  }

}
