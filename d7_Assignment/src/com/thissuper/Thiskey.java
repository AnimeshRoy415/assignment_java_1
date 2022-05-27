package com.thissuper;

public class Thiskey extends Superkey {
	
	String str;
	public Thiskey(String str) {
		
		this.str= str;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("1.  this : 'this' keyword is used to refer the"
				+ "same object and also solve the confusion between instance variable in class and argument.");
		
		Thiskey ts= new Thiskey("1 is theExample of 'this'");
		
		System.out.println(ts.str);

	}

}
