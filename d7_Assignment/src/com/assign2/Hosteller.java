package com.assign2;

public class Hosteller extends Student {
	
	double hostelFee;
	
	public Hosteller(int id,String name,double examfee,double hostfees) {
		this.hostelFee=hostfees;
		this.examFee=examfee;
		this.stuId= id;
		this.stuName=name;
	}

}
