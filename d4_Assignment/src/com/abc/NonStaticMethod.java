package com.abc;

public class NonStaticMethod {
	
	
	void checker(int i) {
		if(i<0) {
			System.out.println("Error");
		}
		else if(i%2!=0) {
			System.out.println(i);
		}
		
		else if(i%2==0) {
			System.out.println( Math.floor(((i/10)+1)*10));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod n= new NonStaticMethod();
		n.checker(22);
	}

}
