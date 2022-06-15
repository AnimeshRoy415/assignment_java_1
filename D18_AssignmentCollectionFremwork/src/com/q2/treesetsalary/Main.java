package com.q2.treesetsalary;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		TreeSet<Employee> employeeDetails= new TreeSet<>();
		
		
		for(int i=1;i<=4;i++) {
			
			System.out.println("Enter employee Id.");
			int id= scanner.nextInt();
			
			System.out.println("Enter employee name.");
			String name= scanner.next();
			
			System.out.println("Enter employee Salary.");
			double salary = scanner.nextDouble();
			
			Employee employee= new Employee(id,name,salary);
			employeeDetails.add(employee);
				
		}
		
		System.out.println(employeeDetails);
		

	}

}
