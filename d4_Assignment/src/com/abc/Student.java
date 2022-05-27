package com.abc;

class Student {
	
	
	
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public void setroll(int roll) {
		
		this.roll= roll;
	}
	
	public void setname(String name) {
		this.name= name;
	}
	
	public void setage (int age) {
		if(age>18 && age<60) {
			this.age= age;
		}
	}
	
	public void setmarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks= marks;
		}
	}
	
	public int getroll() {
		return roll;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public int getmarks() {
		return marks;
	}
	
	
}
	
	
		
		
	
		
		
	

