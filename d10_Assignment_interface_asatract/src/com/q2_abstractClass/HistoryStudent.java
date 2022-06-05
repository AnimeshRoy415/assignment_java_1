package com.q2_abstractClass;

public class HistoryStudent extends Student {
	
	
//	public HistoryStudent(String name, String address) {
//		super(name, address);
//		// TODO Auto-generated constructor stub
//		
//	}
//	
	
	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}



	int historyMarks;
	int civicsMarks;
	
	
	@Override
	double getPercentage() {
		double markParcentage= ((this.historyMarks+this.civicsMarks)*100)/200;
		
		return markParcentage;
	}


	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", name=" + name
				+ ", address=" + address + "]";
	}


//	@Override
//	public String toString() {
//		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + "]";
//	}
	
	
	
	
}
