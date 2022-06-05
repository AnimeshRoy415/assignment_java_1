package com.calculate_area;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		Area area= new Area();
		
		System.out.println("Enter circle redius");
		int radius= scanner.nextInt();
		int circle=area.circleArea(radius);
		
		System.out.println("Enter length for rectangle");
		int length= scanner.nextInt();
		System.out.println("Enter Breadth for rectangle");
		int Breadth= scanner.nextInt();
		
		int rectangle= area.rectangleArea(length, Breadth);
		
		System.out.println("Enter length for square");
		int squarelength= scanner.nextInt();
		int square= area.squareArea(squarelength);
		
		
		System.out.println("Circle area is "+circle);
		System.out.println("Ractangle area is "+ rectangle);
		System.out.println("Square area is "+ square);
		
	}
	

}
