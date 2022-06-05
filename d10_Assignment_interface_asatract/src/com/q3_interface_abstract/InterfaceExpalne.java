package com.q3_interface_abstract;

public interface InterfaceExpalne {
	
	
	void PrintName();
	void PrintAddress();

}


class Child implements InterfaceExpalne{

	@Override
	public void PrintName() {
		// TODO Auto-generated method stub
		System.out.println("Myname is Anni");
		
	}

	@Override
	public void PrintAddress() {
		// TODO Auto-generated method stub
		
		System.out.println("Nandigram");
		
	}
	
	public void ExplainInterface() {
		
		System.out.println("abs");
		
	}
	
	
	
}