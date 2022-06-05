package com.q2_abstractClass;

public abstract class Student {
	
	
	String name;
	String address;
	
	abstract double getPercentage();


	public Student(String name, String address) {
//		super();
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
	

}
