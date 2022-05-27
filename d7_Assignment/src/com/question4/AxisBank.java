package com.question4;

public class AxisBank extends Bank {

	double rateOfInterest;
	
	@Override
	public void displayDetails() {
		System.out.println(branchName);
		System.out.println(IfscCode);
		System.out.println(rateOfInterest);
	}
	
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
}
