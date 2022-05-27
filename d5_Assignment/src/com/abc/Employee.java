package com.abc;

import java.util.Scanner;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
//	public Employee(int id, String name, double salary2) {
//		// TODO Auto-generated constructor stub
//	}
	public void setId(int Id) {
		
		this.employeeId= Id;
		
	}
	public void setName(String name) {
		this.employeeName= name;
	}
	public void setSalary(double rs) {
		this.salary= rs;
	}
	public void setnetSalary(double netS) {
		this.netSalary= netS;
	}
	
	public int getId() {
		return employeeId;
	}
	public String getName() {
		return employeeName;
	}
	public double getsalary() {
		return salary;
	}
	public double getnetsalary() {
		return netSalary;
	}
	
	
	public void calculateNetSalary(int pfpercentage) {
		
		double netsal= this.getsalary()-((this.getsalary()/100)*pfpercentage);
		this.setnetSalary(netsal);
		double x= this.getnetsalary();
		System.out.println("Employee netSalaty: "+ x);
	}
	
	public static Employee getEmployeeDetails(int Id, String name, double salary) {

		Employee emp2= new Employee(Id,name,salary);
		
		return emp2;
		
	}
	
	public Employee(int Id, String name, double salary) {
		
		this.employeeId=Id;
		this.employeeName=name;
		this.salary= salary;
		System.out.println("Employee Id: "+this.employeeId);
		System.out.println("Employee name: "+this.employeeName);
		System.out.println("Employee salary: "+this.salary);
	}
	
	public Employee() {
		
	}
	
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Employe Id");
		int empId= scn.nextInt();
		emp.setId(empId);
		
		System.out.println("Employe name");
		String empname= scn.next();
		emp.setName(empname);
		
		System.out.println("Employe salary");
		double sal= scn.nextDouble();
		emp.setSalary(sal);
		
		System.out.println("Employe P.F Parcentage");
		int PFPer= scn.nextInt();
		emp.calculateNetSalary(PFPer);
		
		getEmployeeDetails(empId,empname,sal);
		
	}

	
}
