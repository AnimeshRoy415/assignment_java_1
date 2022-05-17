package com.abc;

public class Switch {
	
	//String city = "Mumbai","Kolkata","Delhi","Bangalore";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city= "Mumbai";
		
		switch (city) {
		case "Kolkata":
			System.out.println("City of Joy");
			break;
			
		case "Mumbai":
			System.out.println("Financial city");
		break;
				
		case "Bengalore":
				System.out.println("Cyber City");
		break;
		case "Delhi":
			System.out.println("Capitel Of the Country");
	break;

		default:
			System.out.println("May be Other Indian City");
			break;
		}

	}

}
