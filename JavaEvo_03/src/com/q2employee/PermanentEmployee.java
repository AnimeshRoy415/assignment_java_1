package com.q2employee;

public class PermanentEmployee extends Employee {

	
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}



	private double basicPay;
	
	

	void calculateSalary() {
		// TODO Auto-generated method stub
		
	}

}
