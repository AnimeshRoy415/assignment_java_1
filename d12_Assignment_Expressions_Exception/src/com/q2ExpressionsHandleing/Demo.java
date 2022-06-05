package com.q2ExpressionsHandleing;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	Citizen citizen;
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
//		int mobile= Integer.parseInt(aadharCard);
//		int aadhar= Integer.parseInt(mobileNum);
		
		if(Pattern.matches("[A-Z]{1}[a-z]{2,7}",name) && Pattern.matches("[6789]{1}[0-9]{9}", mobileNum)&& Pattern.matches("[0-9]{14}", aadharCard)) {
//			
			
			citizen= new Citizen();
			
			citizen.setName(name);
			citizen.setMobileNumber(mobileNum);
			citizen.setAadharNumber(aadharCard);
			
//			System.out.println(citizen.getName());
			return true;
			
		}else {
			
			
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter name");
		String name= scanner.next();
		
		System.out.println("Enter aadhar number");
		String aadhar= scanner.next();
		
		System.out.println("Enter mobile no,");
		String mobile= scanner.next();
		
		Demo d= new Demo();
		boolean details = d.validate(name, mobile, aadhar);
		
		if(details==true) {
//			Citizen citizen= new Citizen();
			
			System.out.println(d.citizen.getName());
			System.out.println(d.citizen.getMobileNumber());
			System.out.println(d.citizen.getAadharNumber());
			
		}else {
			System.out.println("please enter valid details");
		}
		
		

	}

}
