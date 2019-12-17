package com.bridgelabzs.datastructure;

import com.bridgelabzs.utility.Utility;

public class PrimeAnagramQueue {
	public static void main(String[] args) {
		int size = 1000;
		int primeCount=1;
		int count=0;
		 while(primeCount<=size) {
			if(Utility.prime(primeCount)) {
				count++;
			}
			primeCount++;
		}
		 System.out.println();
		 System.out.println("Prime Anagram are");
		 int[] prime= new int[count];
		 primeCount=1;
		 int loop=0;
		 while(primeCount<=size) {
			 if(Utility.prime(primeCount)) {
				 prime[loop]=primeCount;
				 loop++;
			 }
			 primeCount++;
		 }
		 Utility.primeAnagramLinkedListQueue(prime);
	}
}
