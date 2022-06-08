package com.q3.finallyfinal;

import java.util.Scanner;

public class Demo {
	
	
	private final String aadharNo= "856673930585";
	final String password= "987456";
	private final String mobile= "9876543201";
	
	
	
	public String getAadharNo() {
		return aadharNo;
	}

	public String getPassword() {
		return password;
	}

	public String getMobile() {
		return mobile;
	}



	String signin(String mobile, String password ) throws InvalidDetailsException {
		
		if(getMobile().equals(mobile) && getPassword().equals(password)) {
			
			return getAadharNo();
		}
		else {
			
			InvalidDetailsException IDE= new InvalidDetailsException("Invalid user details");
			
			throw IDE;
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter mobile Number");
		String mobile= scanner.next();
		
		System.out.println("Enter Password");
		String password= scanner.next();
		
		Demo demo= new Demo();
		
		try {
			String aadhar= demo.signin(mobile, password);
			
			System.out.println("Your Aadhar No is "+aadhar);
		}
		catch (InvalidDetailsException e) {
			
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("'final' is a keyword, it is used in variables, methods, classes. 'final' keyword is used for variable to constant"
					+ " the value once it is decleared never ba changed, and if 'final' is used for class then this class can not be extend, for"
					+ " a mothod if you use 'final' keyword this method can not be inherited");
			
			System.out.println("'finally' is a block. It is used with try, try & catch. In compile time or runtime  if app goes smoothly or any"
					+ " exception happende no matter what kind of exception it is finally block will always execute if any kind hardware"
					+ " problem not happend  ");
		}
		
		
	}

}
