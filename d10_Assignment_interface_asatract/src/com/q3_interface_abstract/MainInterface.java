package com.q3_interface_abstract;

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceExpalne interfaceExplain= new Child();
		
		interfaceExplain.PrintAddress();
		interfaceExplain.PrintName();
		
		Child child= (Child)interfaceExplain;
		child.ExplainInterface();
		

	}

}
