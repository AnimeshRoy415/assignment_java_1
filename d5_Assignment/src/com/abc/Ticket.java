package com.abc;

import java.util.Scanner;

public class Ticket {

	private int ticketid; 
	private int price; 
	private static int availableTickets;
	
	
	public void setId(int id) {
		this.ticketid= id;
	}
	public void setprice(int Price) {
		this.price= Price;
	}
	public  void setavilable(int num) {
	
			Ticket.availableTickets= num;
		
	
		
	}
	
	public int getId() {
		return ticketid;
	}
	public int getptice() {
		return price;
	}
	public int getavilable() {
		return availableTickets;
	}
	
	public int calculateTicketCost(int nooftickets) {
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter no of bookings");
		int numOfBook= scn.nextInt();
		
		System.out.println("Enter the available tickets");
		int AVILticket= scn.nextInt();
		
		
		System.out.println("Enter the ticketid");
		int Tic_Id= scn.nextInt();
		
		System.out.println("Enter the price");
		int Price= scn.nextInt();
		
		
		System.out.println("Enter the no of tickets");
		int Number= nooftickets;
		
		int totalPrice= Number*Price;
		setprice(totalPrice);
		
		if(AVILticket>0) {
			setavilable(AVILticket-Number);
		}
		else {
			setavilable(-1);
		}
		
		
		
		return getptice();
		
	}
	
	
}
