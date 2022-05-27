package com.abc;

public class Demo {
	
	int i;
	String s;
	float f;
//	alt+shift+s
	Demo(){
		this(1);
		System.out.println("No argument Present");
		
		}
	Demo(int i){
		this("abc");
		this.i= i;
			System.out.println("integer by constractor overloading "+ i);
		}
	Demo(String s){
		this(1.55f);
		this.s=s;

		System.out.println("string by constractor overloading "+ s);
	}
	Demo(float f){
		
		this.f=f;
		System.out.println("float by constractor overloading "+ f);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();

	}

}
