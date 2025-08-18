package com.simplelearning.java;

public class Example {
	
		 public static void main(String[] arg) {
		 int[] arr = {1,2,3,4,5,6};
		 int firstlargest=0;
		 int secondlargest=0;
		 //int i=0;
		 int n= arr.length;
		 for (int i=0;i<arr.length;i++) 
		 {
		 if (arr[i]>firstlargest){
		 secondlargest= firstlargest;
		 firstlargest=arr[i];
		 }
		 
		 }
		 System.out.println(firstlargest + " " + secondlargest);

		}}



