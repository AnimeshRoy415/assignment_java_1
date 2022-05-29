package com.dyanmicPolymorphism;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	public Student() {
		
	}
	
	
	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}


//	public Student(int i, String string, int j) {
//		this.roll = i;
//		this.name = string;
//		this.marks = j;
//	}


	
	private char calculateGrade(int marks) {
		
		if (marks >= 500) {
			return 'A';
		}
		else if(marks<500 && marks>=400) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
	
	
	


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void displayDetails() {
			
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter Roll");
		int roll= scn.nextInt();
		
		System.out.println("Enter Name");
		String Name= scn.next();
		
		System.out.println("Enter mark");
		int Mark= scn.nextInt();
		
		char grd= calculateGrade(Mark);
		
//		System.out.println(grd);
		
		Student s= new Student(roll, Name, Mark, grd);
		
		System.out.println(s);
		
	}
	
	
//	public static void main(String[] args) {
//		Student ss= new Student();
//		ss.displayDetails();
//		
//	}

}
