package com.assign2;

public class Student {
	
	int stuId;
	String stuName;
	double examFee;
	
	Student(){
		
	}
	
	public void displayDetails() { 
		
	}
	
	public double payFee(double paid) {
		double toBePaid= examFee-paid;
		return toBePaid;
	}

}
