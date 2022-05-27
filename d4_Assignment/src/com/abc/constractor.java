package com.abc;

public class constractor {
	
//	int i;
//	String s;
//	float f;
	
	 constractor() {
		System.out.println("No Argument Present");
		
	}
	 constractor(float f) {
		
		System.out.println(f);
		
	}
	constractor(String s) {
		System.out.println(s);
	
	}
	constractor(int i) {
		System.out.println(i);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constractor c= new constractor("abc");
		

	}

}
