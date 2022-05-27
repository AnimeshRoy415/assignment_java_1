package com.abcde;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= Student.getStudent(false);
		Student s2= Student.getStudent(true);
		
		

		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.collageName);
		
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.address);
		System.out.println(s2.collageName);
		
		

	}

}
