package com.simplelearning.java;

public class CountingVowels 
{

	public static void main(String[] args)
	{
        String word = "OpenAI";
        System.out.println("The number of vowels in '" + word + "' is " + countVowels(word));
    }

		 public static int countVowels(String word)
		 {
		        // Define the vowels
		        String vowels = "aeiouAEIpU";
		        // Initialize the counter
		        int count = 0;
		        // Iterate through each character in the word
		        for (int i = 0; i < word.length(); i++) {
		            // Check if the character is a vowel
		            if (vowels.indexOf(word.charAt(i)) != -1)
		            {
		                // Increment the counter
		                count++;
		            }
		        }
		        return count;
		 }
}


