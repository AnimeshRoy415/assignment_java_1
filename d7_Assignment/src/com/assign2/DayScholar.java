package com.assign2;

public class DayScholar extends Student {
	
	double transportFee;
	public DayScholar(int id,String name,double examfee,double hostfees) {
		this.transportFee=hostfees;
		this.examFee=examfee;
		this.stuId= id;
		this.stuName=name;
	}

}
