package com.q1excepsionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		try {
			
		
		
		System.out.println("Enter Array size");
		int arraysize= scanner.nextInt();
		
		
		int [] array= new int[arraysize];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter index of "+ i);
			int array1= scanner.nextInt();
			
			array[i]= array1;
		}
		
		System.out.println("Enter the index of the array element you want to access");
		
		int index= scanner.nextInt();
		
		System.out.println(array[index]);
		
		System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			
			System.out.println("Please enter Valid Index no.");
		}
		catch (InputMismatchException e) {
			// TODO: handle exception\
			System.out.println("Please enter valid Number only");
		}


	}

}
