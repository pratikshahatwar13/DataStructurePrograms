package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class NumberOfBinarySearchTree {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the total number of testcases");
		double testCases = utility.inputInteger();
		
		while (testCases > 0) {
			System.out.println("Enter total number of nodes");
			double totalNodes = utility.inputInteger();
			double totalTree = Utility.numberOfBinarySearchTree(totalNodes);
			System.out.println(totalTree);
			testCases--;
		}
		System.out.println("Ends");

	}

}
