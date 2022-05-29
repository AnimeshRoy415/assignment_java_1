package com.parent;

public class Parent {
	
	final int number;
	
	
	public Parent(int number) {
		super();
		this.number = number;
	}

	void method1() {
		
		System.out.println("This1 method Belongs to Parent class.");
	}
	
	final void method2() {
		
		System.out.println("This method2 Belongs to Parent class & we can not override it.");	
		}
	void method3() {
		
		System.out.println("This method3 Belongs to Parent class.");
	}
	
	
}
