package com.q2.student.reg.portal;

import java.util.Scanner;

public class UserRegistration {
	
	
	String resisterUser(String username,String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			
			
			String successful= "User registration done successfully";
			
			return successful;
		}
		else {
			
			InvalidCountryException ICE= new InvalidCountryException("User Outside India cannot be registered");
			
			throw ICE;
		}
		
	}

	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String userName= scanner.next();
		
		System.out.println("Enter Your Country");
		String country= scanner.next();
		
		UserRegistration reguser= new UserRegistration();
		
		try {
			String status= reguser.resisterUser(userName, country);
			
			System.out.println(status);
			
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
