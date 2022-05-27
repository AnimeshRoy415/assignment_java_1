package com.assign2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayScholar ds= new DayScholar(530062,"Soumen",5473.00,450.00);
		
		Hosteller hst = new Hosteller(791062,"Prasant",5473.00,950.00);
		
		double x= ds.payFee(2500.00);
		
		System.out.println("Obtain the remaining amount to be paid "+ x);
		
		double y= hst.payFee(3220.00);
		
		System.out.println("Obtain the remaining amount to be paid "+ y);
		
		
	}

}
