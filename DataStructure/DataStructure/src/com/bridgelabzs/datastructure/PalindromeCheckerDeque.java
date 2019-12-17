package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class PalindromeCheckerDeque {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the word to check palindrome");
		String word = utility.inputString();
		boolean b = Utility.palindromeChecker(word);
		if(b)
			System.out.println("Word is Palindrome");
		else
			System.out.println("Word is Not Palindrome");
	}
}
