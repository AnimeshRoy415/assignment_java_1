package com.question4;

import java.util.Scanner;

public class Demo {

	
	public static Bank getBank(String bank) {
		
		ICICIBank ici= new ICICIBank();
		AxisBank Axis= new AxisBank();
		
		if(bank.equals("axis")) {
			
			Scanner scn= new Scanner(System.in);
			System.out.println("Branch Name");
			String Branch= scn.next();
			Axis.branchName=Branch;
			
			System.out.println("Ifsc Code");
			String ifsc= scn.next();
			Axis.IfscCode= ifsc;
			
			System.out.println("rate Of Interest");
			double interest= scn.nextDouble();
			Axis.rateOfInterest= interest;

			return  Axis;
		}
		else if(bank.equals("icici")) {
			
			Scanner scn= new Scanner(System.in);
			System.out.println("Branch Name");
			String Branch= scn.next();
			ici.branchName=Branch;
			
			System.out.println("Ifsc Code");
			String ifsc= scn.next();
			ici.IfscCode=ifsc;
			
			System.out.println("rate Of Interest");
			double interest= scn.nextDouble();
			ici.rateOfInterest=interest;
			
//			System.out.println(ici.branchName);
//			System.out.println(ici.IfscCode);
//			System.out.println(ici.rateOfInterest);
			
			return ici;
		}
		else {
			
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank ici= new ICICIBank();
		AxisBank Axis= new AxisBank();
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Bank Name");
		String bank= scn.next();
		Bank bnk= getBank(bank);
		
		
		
//		System.out.println(ic.rateOfInterest);
		
		if( bank.equals("axis")) {
			AxisBank a1= (AxisBank)bnk;
			
			Axis.branchName=a1.branchName;
			Axis.IfscCode=a1.IfscCode;
			Axis.rateOfInterest= a1.rateOfInterest;
			
			Axis.displayDetails();
			Axis.getCreditCard();
			
		}
		else if( bank.equals("icici")) {
			ICICIBank ic= (ICICIBank)bnk;
			
			ici.branchName=ic.branchName;
			ici.IfscCode=ic.IfscCode;
			ici.rateOfInterest=ic.rateOfInterest;
			ici.displayDetails();
			
		}
				
		

	}


}
