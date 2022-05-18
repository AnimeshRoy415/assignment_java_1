package com.abcd;

public class Student {
	
	int roll;
	String name;
	int mark;
	
	void displayStudentDetails(int roll, String name, int marks) {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		
		int r= s1.roll= 1;
		String n= s1.name= "anni";
		int m= s1.mark= 693;
		s1.displayStudentDetails(r, n, m);
		
		Student s2 =s1;
		
		s1=null;
		
		r= s2.roll= 10;
		n= s2.name= "laxmi";
		m= s2.mark= 593;
		
		s2.displayStudentDetails(r, n, m);
		
		s2=null;
		

	}

}
