package com.q1.InsufficientFundsException;

import java.util.Scanner;

public class AccountDemo  {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		Account account= new Account("1234567890");
		
		System.out.println("Enter diposit amount");
		double dipositAmount= scanner.nextDouble();
		account.deposit(dipositAmount);
		
		System.out.println("Enter withdraw amount");
		double withdrawAmount= scanner.nextDouble();
		
		
			try {
				
				double remainingBalance = account.withdraw(withdrawAmount);
				account.setBalance(remainingBalance);
				
				System.out.println("Clear Balance is "+account.getBalance());
			} catch (InsufficientFundException ife) {
				// TODO Auto-generated catch block
				System.out.println(ife.getMessage());
			}
			
			
			
			
			
	
		
//		Double netBalance= account.getBalance();
		
		

	}

}
