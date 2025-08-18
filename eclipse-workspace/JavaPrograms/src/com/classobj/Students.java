package com.classobj;

public class Students {
	
	
	int rollNumber;
	String name;
	static String schoolName = "Ravindra Public School";
	static String schoolAddress = "Pitampura,Delhi -85";
	
	

	public String getStudentDetailss(String naam,int roll)
	{
		name=naam;
		rollNumber=roll;
		return naam + roll;
	}
}	
	
	
	

	

