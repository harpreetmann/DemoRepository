package com.classobj;

public class Student {

	int rollNumber;
	String name;
	static String schoolName = "Ravindra Public School";
	static String schoolAddress = "Pitampura,Delhi -85";
	
	public String getStudentDetails(Student studentprofile)
	{
		String naam = studentprofile.name;
		int roll = studentprofile.rollNumber;
		return naam + roll;
	}

}
	
	
	
	
	
	
	
	

