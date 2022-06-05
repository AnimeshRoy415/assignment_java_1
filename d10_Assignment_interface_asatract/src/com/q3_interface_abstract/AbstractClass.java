package com.q3_interface_abstract;

public abstract class AbstractClass {

	public void animal() {
		
		System.out.println("Animal has four legs");
		
	}
	
	abstract void eat();
	abstract void makeNoise();
	
}


class Cat extends AbstractClass {

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Cat drink milk");
		
	}

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Cat sounds meaw...");
	}
	
	
	
	
	
	
	
}
