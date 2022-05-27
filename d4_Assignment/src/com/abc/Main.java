package com.abc;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s2= new Student();
		Student s1= new Student();
		
		System.out.println(s2);
		
		s1.setroll(02);
		System.out.println(s1.getroll());
		s1.setname("Anni");
		System.out.println(s1.getname());
		s1.setage(25);
		System.out.println(s1.getage());
		s1.setmarks(480);
		System.out.println(s1.getmarks());

	}

}
