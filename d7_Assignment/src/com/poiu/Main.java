package com.poiu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		Manager m= new Manager();
		
		e.Name="sartha";
		e.Age=23;
		e.Phone_Number= "1234509876";
		e.Address="Kolkata";
		e.Salary= 30000.00;
		
		m.Name="Anni";
		m.Age=25;
		m.Phone_Number= "9745630210";
		m.Address="Namdigram";
		m.Salary= 180000.00;
		
		
		System.out.println(e.Name);
		System.out.println(e.Age);
		System.out.println(e.Phone_Number);
		System.out.println(e.Address);
		System.out.println(e.Salary);
		System.out.println(m.Name);
		System.out.println(m.Age);
		System.out.println(m.Phone_Number);
		System.out.println(m.Address);
		System.out.println(m.Salary);
		
	}

}
