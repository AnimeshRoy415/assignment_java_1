package com.abcd;

public class CheckWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSnowing= false;
		boolean isRaining= false;
		double temperature = 40.0;
		
		reportweather(isRaining,isSnowing,temperature);

	}
	
	static void reportweather(boolean isRaining, boolean isSnowing, double temperature) {
		
		if( isRaining || isSnowing || temperature<50.0) {
			System.out.println("Let’s stay home.");
		}
		else {
			System.out.println("Let’s go out!");
		}
		
	}

}
