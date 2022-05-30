package com.q4;

public class Main extends Person {

	
	public static Person generatePerson(Person person) {
		
		return person;
		
	}
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
		
		
	}
	
	@Override
	public String toString() {
		return "Main [name=" + name + ", gender=" + gender + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
