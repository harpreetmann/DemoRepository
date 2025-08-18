package com.classobj;


	public class Calculator {

	    // Method to add two numbers and return the result
	    public int add(int a, int b) {
	        return a + b;  // return the sum
	    }

	    public static void main(String[] args) {
	        Calculator calc = new Calculator();
	         int result = calc.add(5, 3);  // call add method
	        System.out.println("Sum is: " + result);  // call add method
   
	    }
	}


