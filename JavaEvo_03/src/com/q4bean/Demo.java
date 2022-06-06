package com.q4bean;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		try {
		System.out.println("Enter user name");
		String username= scanner.next();
		
		System.out.println("Enter password");
		String password= scanner.next();
		
		System.out.println("Enter valid mobile number");
		String mobile= scanner.next();
		
		System.out.println("Enter valid email");
		String email= scanner.next();
		
		if(Pattern.matches("[a-z]{3,8}",username)  && Pattern.matches("[a-zA-Z0-9]{3,8}", password)
				&& Pattern.matches("[6789]{1}[0-9]{9}", mobile)) {
			
			Customer customer = new Customer();
			customer.setEmail(email);
			customer.setMobileNumber(mobile);
			customer.setPassword(password);
			customer.setUsername(username);
			
			System.out.println(customer.getEmail());
			System.out.println(customer.getMobileNumber());
			System.out.println(customer.getPassword());
			System.out.println(customer.getUsername());
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Pelase enter valid details");
		}

	}

}
