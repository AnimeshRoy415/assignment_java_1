package com.q2_abstractClass;

public class ScienceStudent extends Student {
	
	
//	public ScienceStudent(String name, String address) {
//		super(name, address);
//		// TODO Auto-generated constructor stub
//	
//	}

	public ScienceStudent(String name, String address, int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	
	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		
		double parcentage= ((this.physicsMarks+this.chemistryMarks+this.mathsMarks)*100)/300;
		return parcentage;
	}


	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", name=" + name + ", address=" + address + "]";
	}


//	@Override
//	public String toString() {
//		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
//				+ mathsMarks + "]";
//	}
	
	
	
	
	
	

}
