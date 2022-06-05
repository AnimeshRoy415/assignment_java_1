package com.q3.Enum;

import java.util.Scanner;

public class Ipl {
	
	
	
	void homeTeamStadium(Stadium stadium) {
		
		switch (stadium) {
		case CHIDAMBARAM_STADIUM:
			
			System.out.println("This is the home ground of CSK");
			
			break;
			
		case EDEN_GARDENS_STADIUM:
			
			System.out.println("This is the home ground of KKR");
			
			break;
		case M_CHINNASWAMY_STADIUM:
	
			System.out.println("This is the home ground of RCB");
	
			break;
		case WANKHEDE_STADIUM:
	
			System.out.println("This is the home ground of Mumbai Indians");
	
			break;

		default:
			System.out.println("Other Stadium");
			break;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		Ipl ipl= new Ipl();
		
		System.out.println("Enter Stadium name");
		
		try {
		String stadiumName= scanner.next();
		Stadium stadium= Stadium.valueOf(stadiumName);
		
		ipl.homeTeamStadium(stadium);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("please enter valid stadiun");
		}
		

	}

}
