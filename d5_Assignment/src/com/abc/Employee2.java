package com.abc;

import java.util.Scanner;

public class Employee2 {
	private int empId;
	private String empname;
	private double salary;
	private  double netSalary;
	
	public static Employee2 getEmployeeDetails(int id, String name, double salary) {
		
		Employee2 emp2= new Employee2(id,name,salary);
//		System.out.println(emp2.empId);
//		System.out.println(emp2.empname);
//		System.out.println(emp2.salary);
		return emp2;
	}
	
	public Employee2(int empId, String empname, double salary) {
//		super();
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
	}
	
	public static int getPFPercentage(int pfPercentage) {
		int pf= pfPercentage;
//		System.out.println(pf);
		return pf;
	}
	
	public void CalculatenetSalary(int pfPercentage) {
		
		//System.out.println(this.getSalary());
		double  am = this.getSalary() - this.getSalary()/100 * pfPercentage;
		System.out.println(am);
		this.setNetSalary(am);
	}
	

	
	
	public Employee2() {
		super();
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getNetSalary() {
		return netSalary;
	}


	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee2 [empId:" + empId + ", empname:" + empname + ", salary:" + salary + ", netSalary:" + netSalary
				+ "]";
	}
	

	public static void main(String[] args) {
		Employee2 emp = new Employee2();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Employee Id");
		int empid = scn.nextInt();
		emp.setEmpId(empid);
		
		System.out.println("Employee Name");
		String name = scn.next();
		emp.setEmpname(name);
		
		System.out.println("Employee Salary");
		double sal = scn.nextDouble();
		emp.setSalary(sal);
		
		
		System.out.println("Employee P.F. Parcentage");
		int pfPer = scn.nextInt();
		
		getEmployeeDetails(empid,name,sal);
		int parcent=getPFPercentage(pfPer);
		
		emp.CalculatenetSalary(parcent);
		
		System.out.println(emp);
		
	}
	

}
