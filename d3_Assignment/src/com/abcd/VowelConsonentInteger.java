package com.abcd;

public class VowelConsonentInteger {
	
	void CheckVowelConsonent(char cap) {
		
		cap= Character.toLowerCase(cap);
		
//		System.out.println(cap);
		
		if(cap=='a' || cap=='e' || cap=='i' || cap=='o' || cap=='u') {
			System.out.println("Vowel");
		}
		else if(cap=='b' || cap=='c' || cap=='d' || cap=='f' || cap=='g'||
				cap=='h' || cap=='j' || cap=='k' || cap=='l' || cap=='m'||
				cap=='n' || cap=='p' || cap=='q' || cap=='r' || cap=='s'||
				cap=='t' || cap=='v' || cap=='w' || cap=='x' || cap=='y'||
				cap=='z') {
			System.out.println("Consonent");
			
		}
		else {
			System.out.println("invalid character");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	VowelConsonentInteger abc = new VowelConsonentInteger();
	
	abc.CheckVowelConsonent('A');
	abc.CheckVowelConsonent('B');
	abc.CheckVowelConsonent('5');
		

	}

}
