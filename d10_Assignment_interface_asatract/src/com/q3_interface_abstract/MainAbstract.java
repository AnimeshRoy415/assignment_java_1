package com.q3_interface_abstract;

public class MainAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			AbstractClass abs= new Cat();
			abs.animal();
			
			Cat cat=(Cat)abs;
			cat.eat();
			cat.makeNoise();

	}

}
