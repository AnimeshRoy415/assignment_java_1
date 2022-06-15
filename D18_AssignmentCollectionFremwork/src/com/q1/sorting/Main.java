package com.q1.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		ProductNameComp sortName= new ProductNameComp();
		ProductIdComp sortId= new ProductIdComp();
		ProductPriceComp sortPrice= new ProductPriceComp();
		
		List <Product> product= new ArrayList<>();
		boolean flag= false;
		
		for(int i=1;i<=4;i++) {
			
			try {
				
				System.out.println("Enter Product Id.");
				int id= scanner.nextInt();
				
				System.out.println("Enter Product Name.");
				String name= scanner.next();
				
				System.out.println("Enter Product Price.");
				double price= scanner.nextDouble();
				
				product.add( new Product(id,name,price));
				
			} catch (InputMismatchException e) {
				
				System.out.println("please Enter Details in Right Format");
				flag= true;
				break;
			}
			
		}
		
		if(flag== false) {
			
			try {
				System.out.println("Please enter (1/2/3) for sorting.");
				int sortinginput = scanner.nextInt();
				
				if(sortinginput== 1) {
					Collections.sort(product, sortPrice);
					System.out.println(product);	
				}
				else if(sortinginput== 2) {
					Collections.sort(product, sortName);
					System.out.println(product);
				}
				else if (sortinginput== 3) {
					Collections.sort(product, sortId);
					System.out.println(product);
				}
			}
			catch (Exception e) {
				
				Collections.sort(product, sortId);
				System.out.println(product);
			}
			
		}
		
		
	}

}
