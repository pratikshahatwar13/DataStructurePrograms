package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter month and year");
		int month = utility.inputInteger();
		int year = utility.inputInteger();
		Utility.calender(month,year);

	}

}
