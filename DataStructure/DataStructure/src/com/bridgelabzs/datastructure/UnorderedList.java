package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class UnorderedList {

	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		System.out.println("Enter the word to be searched");
		String userInput = utility.inputString();
		Utility.unOrderedList(userInput);

	}

}
