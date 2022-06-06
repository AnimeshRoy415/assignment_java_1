package com.q2employee;

public abstract class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public void Employee1(int employeeId2, String employeeName2) {
		// TODO Auto-generated constructor stub
	}
	public void Employee11(int employeeId2, String employeeName2) {
		// TODO Auto-generated constructor stub
	}
	abstract void calculateSalary();
	
	

}
