package com.q1;

public class ZImpl implements Z {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Override method1(X) in ZImpl");
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("Override method4(Y) in ZImpl");
	}

	@Override
	public void method7() {
		// TODO Auto-generated method stub
		System.out.println("Override method7(Z) in ZImpl");
		
	}
	
	
	@Override
	public void method2() {
		
		System.out.println("Overridden default method2 of interface Y");
	}
	

}
