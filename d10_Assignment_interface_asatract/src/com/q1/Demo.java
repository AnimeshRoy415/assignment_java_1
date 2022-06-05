package com.q1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		
		if(amount>=1000) {
			Hotel hotelTaj= new TajHotel();
			return hotelTaj;
		}
		else if(amount>200 && amount<1000) {
			
			Hotel hotelRoadside= new RoadSideHotel();
			
			return hotelRoadside;
		}else {
			return null;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Price");
		int price= scn.nextInt();
		
		if(price>=200) {
		
				Demo demo= new Demo();
				Hotel HotelObj= demo.provideFood(price);
				
				if(HotelObj instanceof TajHotel) {
					
					HotelObj.chickenBiryani();
					HotelObj.masalaDosa();
					
					TajHotel taj= (TajHotel)HotelObj;
					taj.welcomeDrink();
					
				}
				else {
					HotelObj.chickenBiryani();
					HotelObj.masalaDosa();
					
				}
			
		}else {
			
			System.out.println("Please Enter valid amount");
		}
		
		
		
	}

	
	
	
}
