package com.wxzy;

public class Main {
	
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		int [] arr1= new int [inputArray.length];

		int ind=0;
		
		for(int i=0;i<inputArray.length;i++) {
			int count=0;
			for(int j=1;j<=inputArray[i];j++) {
				
				if(inputArray[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				arr1[ind++]=inputArray[i];
//				System.out.println(inputArray[i]);
			}
			
		}
	
		return arr1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main= new Main();
		
		int[] arr = {10,12,5,50,11,14,15};
		
		int[] x= main.findAndReturnPrimeNumbers(arr);
		
		boolean flag= true;
		for(int i=0;i<x.length;i++) {
			if(x[i]!=0) {
				flag=false;
				System.out.println(x[i]);
			}
		}
		if(flag==true) {
			System.out.println("Prime number not found in the supplied Array");
		}
		
		
		

	}

}
