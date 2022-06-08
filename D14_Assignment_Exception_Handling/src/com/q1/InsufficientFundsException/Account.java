package com.q1.InsufficientFundsException;

public class Account  {
	
	
	private String accountNumber;
	private double Balance;
	
	
	public double getBalance() {
		return Balance;
	}


	public void setBalance(double balance) {
		Balance = balance;
	}
	
//
//	public String getAccountNumber() {
//		return accountNumber;
//	}
//
//
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}

	

	public Account(String accountNumber) {
		
		this.accountNumber = accountNumber;
	}
	

	void deposit(double amount) {
		
		this.Balance= getBalance()+amount;
		
	}
	
	double withdraw(double amount) throws InsufficientFundException {
		
		if(getBalance()>=amount) {
			double remainingBalance= getBalance()-amount;
			
			return remainingBalance;
		}
		else {
			
			InsufficientFundException IFS= new InsufficientFundException("Insufficient Balance");
			
			throw IFS;
		}
		
		
		
		
		
		
	}
}
