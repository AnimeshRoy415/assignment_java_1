package com.array;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str= new String[args.length];
		
		int a=0;
		for(int i=0;i<args.length;i++) {
			str[a++]= args[i];
			
			
		}
		
//		System.out.println(str.length);
		if(str.length>2) {
			System.out.println("Error");
		}else if(str.length==1) {
			int num= Integer.parseInt(str[0]);
			int fact=1;
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		}
		else if(str.length==2) {
			int num= Integer.parseInt(str[0]);
			
			int num1= Integer.parseInt(str[1]);
//			System.out.println(str[1]);
//			
			int absdiff= num-num1;
			System.out.println(Math.abs(absdiff));
		}

	}

}
