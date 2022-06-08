package com.q1calculateage;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class CalculateAge {
	
	
	Period ageCalculator(String DOB) throws InvalidDateFormat {
		
		
		DateTimeFormatter dpf= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
//		LocalDate dateOfBirth= LocalDate.parse(DOB, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		try {
			LocalDate dateOfBirth= LocalDate.parse(DOB,dpf);

			
			LocalDate currentDate= LocalDate.now();
		
			if(currentDate.isAfter(dateOfBirth)) {
				
				Period calculateAge = Period.between(dateOfBirth, currentDate);
				

				
				DateTimeFormatter dateobj= DateTimeFormatter.ofPattern("DD-MM-YYYY");
				
				return calculateAge;
			}
			else {
				System.out.println("Date should not be in Future");
				return null;
			}
			
		}
		catch (DateTimeParseException e) {

			
			InvalidDateFormat idf= new InvalidDateFormat("Please enter approprieate format");
			
			throw idf;
		}
		
		
	}

	
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter your date of birth in dd-MM-yyyy format");
		String DOB= scanner.next();
		
		CalculateAge calculateAge = new CalculateAge();
		
		try {
			Period p1= calculateAge.ageCalculator(DOB);
			
			if(p1!=null) {
				System.out.println(p1.getDays());
				System.out.println(p1.getMonths());
				System.out.println(p1.getYears());
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
