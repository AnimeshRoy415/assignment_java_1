package com.parent;

import java.util.Scanner;

public final class Child extends Parent {
	
	
	void method4() {
		System.out.println("This method4 Belongs to Child(final) class.");
	}

	@Override
	void method1() {
		
		if(number>=1 && number<=10) {
			System.out.println("You have entered: "+number);
		}else {
			System.out.println("You have entered Invalid number.");
		}
		
		System.out.println("This method1 Belongs to Parent class I have overriden it.");
	}
	 
	
	
	public Child(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the Number 1 to 10");
		int num= scn.nextInt();

		Parent par= new Child(num);
		
		par.method1();
		par.method2();
		par.method3();
		
		Child c= (Child)par;
		c.method4();
	}

	
		
		
	
}
