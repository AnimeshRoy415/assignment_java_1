package com.q2_abstractClass;

import java.util.Scanner;

public class AllStudents {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name= scanner.next();
		
		System.out.println("Enter Address");
		String address= scanner.next();
		System.out.println("Enter physicsMarks");
		int physic= scanner.nextInt(); 
		
		System.out.println("Enter chemistryMarks");
		int chemistry= scanner.nextInt();
		
		System.out.println("Enter mathsMarks");
		int math= scanner.nextInt();
		
		ScienceStudent sciencestudent= new ScienceStudent(name, address, physic, chemistry, math);
		
		
		
		System.out.println("Enter Name");
		String Historystudentname= scanner.next();
		
		System.out.println("Enter Address");
		String studentaddress= scanner.next();
		
		System.out.println("Enter History mark");
		int history= scanner.nextInt();
		
		System.out.println("Enter Civics mark");
		int civic = scanner.nextInt();
		
		HistoryStudent historystudent1= new HistoryStudent(Historystudentname, studentaddress, history, civic);
		
		
		System.out.println(sciencestudent);
		System.out.println(sciencestudent.getPercentage());
		
		
		System.out.println(historystudent1);
		System.out.println(historystudent1.getPercentage());
	}

}
