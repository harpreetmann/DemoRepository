package com.simplelearning.java;

public class ReverseString {

	public static void main(String[] args) {
		String s = "simple";
		String x ="";
		int len = s.length();
		System.out.print(len);
		for(int i=len-1;i>=0;i--)
		{
			
	
			x= x+s.charAt(i);
		}
		System.out.println(x);
	}

}
