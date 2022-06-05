package com.q1;

public interface Y {
	

	void method4();
	
	 default void method5() {
		
		System.out.println("default method5 from interface Y");
	}
	
	static void method6() {
		System.out.println("Static method6 interface from Y");
	}
	

}
