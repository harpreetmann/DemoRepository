package com.simplelearning.java;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	    String string1 = "Hello";
	    String string2 = "worldd";

	    // Concatenate both strings into string1
	    string1 = string1 + string2; // string1 = "Helloworld"

	    // Extract the original string1 value into string2
	    string2 = string1.substring(0, string1.length() - string2.length()); // string2 = "Hello"

	    // Extract the original string2 value into string1
	    string1 = string1.substring(string2.length()); // string1 = "world"

	    // Print the swapped values
	    System.out.println("string1: " + string1); // world
	    System.out.println("string2: " + string2); // Hello
	}

}
