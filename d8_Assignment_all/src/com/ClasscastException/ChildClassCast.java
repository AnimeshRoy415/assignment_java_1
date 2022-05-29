package com.ClasscastException;

public class ChildClassCast extends ClassCastException {

	String Address= "Nandigram";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassCastException CCS= new ChildClassCast();
		CCS.name();
		
		ChildClassCast CCC= (ChildClassCast)CCS;	// classdowncasting;
		
		System.out.println(CCC.Address);
		
		System.out.println("When we creat an Child class object refer of Parent class object, we can access Parent class properties And child"
				+ " class overriden properties but we can't access the child class own properties to access it we have to downcast from parent class"
				+ "object to child class if we don't downcast it the compiler will throw an error that error is called 'ClassCastException'. Here "
				+ "in line no. 13 we are downcasting the parent class to childclass.");
		
	}

}


class ClassCastException {

	
	int num;
	
	public void name() {
		
		System.out.println("My name is Anni.");
		System.out.println("My age is 25.");
	}
	

}