package com.xzy;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] mat= {
							{1,2,3},
							{4,5,6},
							{7,8,9}
						};
		
		for(int i=0;i<mat.length;i++) {
			int sum=0;
			for(int j=0;j<mat[i].length;j++) {
				
				if(mat[j][i]%2==0) {
					
					sum=sum+mat[j][i];
				}
			}
			
			System.out.println(sum);
		}
	}

}
