package com.q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		//Write logic to get numberOfPassenger and numberOfKms
		System.out.println("Passenger no.");
		int numberOfPassenger= scanner.nextInt();
		System.out.println("Number of Km.");
		int numberOfKms= scanner.nextInt();

		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);

	}

}
