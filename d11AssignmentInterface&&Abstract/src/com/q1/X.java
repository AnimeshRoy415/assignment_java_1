package com.q1;

public interface X {
	
	
	void method1();
	
	default void method2() {
		
		System.out.println("method2 from interface X");
	}
	
	static void method3() {
		System.out.println("Static method3 interface from X");
	}

}
