package com.abc;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 20;
		if(n>100 || n<2) {
			System.out.println("Invalid number");
		}
		else {
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
		}
		
		

	}

}
