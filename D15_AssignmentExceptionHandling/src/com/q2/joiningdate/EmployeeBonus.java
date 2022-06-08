package com.q2.joiningdate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {
	
	
	double calculateBonus(String joindate) throws InvalidAge {
		
		double bonus = 0;
		
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
		
		LocalDate current= LocalDate.now();
		
		LocalDate joining= LocalDate.parse(joindate,dateformat);
		
		if(current.isAfter(joining)) {
			
				
				Period year= Period.between(joining,current);
				
				if(year.getYears()<1) {
					
					bonus= 5000;
					
	
				}
				else if(year.getYears()>1 && year.getYears()<2) {
					
					bonus=8000;
			
				}
				else {
					
					bonus= 10000;
					
				}
				
			
		}
		else {
			InvalidAge invage= new InvalidAge("Age should not be in the future");
			throw invage;
		}
		
		return bonus;
		}catch (Exception e) {
			// TODO: handle exception
			InvalidAge invage= new InvalidAge("Please pass the date in the correct format");
			throw invage;
		}
		
		
		
		
	}

	
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter joining Date in mm-dd-yyyy format.");

		String date= scn.next();
		
		EmployeeBonus employee= new EmployeeBonus();
		
		
		try {
			double getBonus = employee.calculateBonus(date);
			
			System.out.println(getBonus);
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
		
		
	}
	
	
}
