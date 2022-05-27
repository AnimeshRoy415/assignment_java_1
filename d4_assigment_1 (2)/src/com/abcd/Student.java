package com.abcd;

public class Student {
	
	int roll;
	String name;
	String address;
	String collageName;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	
	
	public static Student getStudent(boolean isFromNIT) {
		Student student= new Student();
		if(isFromNIT==true) {
			student.collageName="";
			student.address= "Kolakta";
			student.name= "Anni";
			student.roll= 02;
			
			return student;	
		}
		else {
			student.collageName="IIT";
			student.address= "Haldia";
			student.name= "Animesh";
			student.roll= 01;
			return student;	
		}
	}
	
	
}
