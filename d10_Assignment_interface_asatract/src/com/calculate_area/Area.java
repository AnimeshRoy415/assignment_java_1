package com.calculate_area;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		
		int Ractanglearea= (length*breadth);
		
		
		return Ractanglearea;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int squarearea= side*side;
		return squarearea;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		
		double circlearea=(3.14*(radius*radius));
		
		int circle= (int)circlearea;
		
		return circle;
	}
	
	
	
	

}
