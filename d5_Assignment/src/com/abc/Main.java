package com.abc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket tic= new Ticket();
		int x=tic.calculateTicketCost(5);
		
		int y= tic.getptice();
		int z= tic.getavilable();
		System.out.println(y);
		System.out.println(z);

	}

}
