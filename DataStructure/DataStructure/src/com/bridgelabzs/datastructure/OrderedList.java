package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		System.out.println("Enter the number to be searched");
		String searchItem  = utility.inputString();
		Utility.orderedList(searchItem);

	}

}
