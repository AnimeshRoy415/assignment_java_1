package com.q2;

import java.util.Scanner;

public class Demo extends Student {
	
	public Demo(int roll, String name, String address, int marks) {
		super(roll, name, address, marks);
		// TODO Auto-generated constructor stub
	}
	
	int sum;
	public void markAve(int mark, int length) {
		
		sum=this.sum+mark;
		int average= sum/length;
		
		System.out.println(average);
	}
	
	
	

	public static void main(String[] args) {
		
		
		System.out.println("Enter Student Number");
		Scanner scn= new Scanner(System.in);
		
		int makelength= scn.nextInt();
		
		int [] arrobj= new int [makelength];
		
		for(int i=0;i<arrobj.length;i++) {
			
			System.out.println("Enter roll");
			int Roll= scn.nextInt();
			System.out.println("Enter Name");
			String name= scn.next();
			System.out.println("Enter Address");
			String Address= scn.next();
			System.out.println("enter marks");
			int mark= scn.nextInt();
			
			Demo d= new Demo(Roll, name, Address, mark);
			d.sum= d.sum+mark;
			System.out.println(d.sum/makelength);
			System.out.println(d);
			
		}
	

	}


	
}
