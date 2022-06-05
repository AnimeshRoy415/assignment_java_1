package com.q2.abstractinstanc;

public class Mobile {
	
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	
	void searchOutdatedModel(String mobilecompany, String... model ) {

		boolean flag=true;
		
		for(int i=0;i<outdatedModels.length;i++) {
			
			for(String j: model) {
				if(outdatedModels[i].equals(j)) {
					System.out.println(j+"_OUTDATED");
					flag=false;
					
				}
			
			}
			
		}
		if(flag==true) {
			System.out.println("Model no. not match");
		}
	}
}
