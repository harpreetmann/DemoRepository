package com.simplelearning.java;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10; // Number of terms in the Fibonacci series

        // Print the first two numbers
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) { // Start loop from 2 as we already printed first two numbers
            int sum = a + b;
            System.out.print(" " + sum);      
            a = b;
            b = sum;
        }
    }
}

//to print in new line
//System.out.println("GFG" + '\n' + "gfg"); 

