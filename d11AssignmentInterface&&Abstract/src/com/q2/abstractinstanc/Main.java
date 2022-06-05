package com.q2.abstractinstanc;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner= new Scanner(System.in);
//		
//		System.out.println("Enter Mobile company");
//		String company= scanner.next();
//		
//		System.out.println("Enter model no.");
//		String model= scanner.next();
		
		Mobile mobile= new Mobile();
		
		mobile.searchOutdatedModel("samsung","note4","note");
		
		
		
		
	}

}
