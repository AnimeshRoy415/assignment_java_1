package com.xzy;
import java.util.Scanner;

public class Main {
	
	
	
	public static String reversString(String input){
	//write the logic
		
//		char [] chr= new char[input.length()];
//		int a=0;
//		for (int i=input.length()-1;i>=0;i--) {
//			chr[a++]=input.charAt(i);
////			a++;
//		}
//		String str= new String(chr);
		
		char [] ch= input.toCharArray();
		
		String str="";
		for (int i=ch.length-1;i>=0;i--){
			
			str= str+ ch[i];
		}
		
		
		return str;
	}
	
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a String to reverse");
	String originalString = sc.next();
	
	String result = reversString(originalString);
	
	System.out.println("Original String is :"+ originalString);
	
	System.out.println("Reversed String is :"+ result);
	}
	
}


