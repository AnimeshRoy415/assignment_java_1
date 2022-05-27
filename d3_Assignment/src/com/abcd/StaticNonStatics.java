package com.abcd;

public class StaticNonStatics {

	static int a= 123;
	
	int z= 987;
	
	String abc = "A static variable acts as a global variable and is shared among all the "
			+ "objects of the class. A non-static variables are specific to instance object"
			+ "in which they are created. Static variables occupies less space and memory allocation"
			+ "happens once. A non-static variable may occupy more space.";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		
		StaticNonStatics st= new StaticNonStatics();
		
		System.out.println(st.z);
		System.out.println(st.abc);
		

	}

}
