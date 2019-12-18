package com.bridgelabzs.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgelabzs.utility.Utility;

public class Hashing {

	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		System.out.println("Enter the size");
		int size = utility.inputInteger(); 
		HashChaining linkedHash = new HashChaining(size);
		File file = new File("/home/user/Pratiksha/DataStructure/DataStructure/src/com/bridgelabzs/datastructure/Hash.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String readFileStore = "";
		String readFile;
		while ((readFile = bufferedReader.readLine()) != null) {
			readFileStore = readFileStore + readFile +" ";
		}
		bufferedReader.close();
		for (String fileString : readFileStore.split("\\s", 0)) {
			int number = Integer.parseInt(fileString);
			linkedHash.insert(number);
		}
		System.out.println("Find the number to be searched");
		int value = utility.inputInteger();
		linkedHash.search(value);
		linkedHash.display();
		linkedHash.write();

	}

}
