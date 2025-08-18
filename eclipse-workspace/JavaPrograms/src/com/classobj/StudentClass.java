package com.classobj;

public class StudentClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.name ="Santosh";
		stu.rollNumber = 34;
		
		String output1= stu.getStudentDetails(stu);
		System.out.println(output1);
		
		
		Student stu2 = new Student();
		stu2.name ="Chandanh";
		stu2.rollNumber = 35;
		
		String output2 =stu2.getStudentDetails(stu2);
		System.out.println(output2);
		
		
	}

}
