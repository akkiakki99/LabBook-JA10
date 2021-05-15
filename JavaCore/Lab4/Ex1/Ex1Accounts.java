package com.capg.lab4;

public class Ex1Accounts {
	static int acc = 101;
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Ex1Accounts( double balance, Person accHolder) {
		super();
		this.setAccNumini();
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public void setAccNumini() {
		this.accNum = acc++;
	}
	
	public long getAccNum() {
		return accNum;
	}
	
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	
	void deposit(double balance, Ex1Accounts Acc)
	{
		double currentbalance = Acc.getBalance();
	  	double updatedbalance = currentbalance + balance;
	  	Acc.setBalance(updatedbalance);
	}
	
	void withdraw(double balance,Ex1Accounts Acc)
	{
		double currentbalance = Acc.getBalance();
	  	double updatedbalance = currentbalance - balance;
	  	Acc.setBalance(updatedbalance);
	}
	
	

}
