package com.bridgelabzs.utility;
import java.io.*;
import java.util.*;

import com.bridgelabzs.datastructure.LinkedList;
import com.bridgelabzs.datastructure.LinkedQueue;
import com.bridgelabzs.datastructure.LinkedStack;
import com.bridgelabzs.datastructure.MyDeque;
import com.bridgelabzs.datastructure.MyQueue;
import com.bridgelabzs.datastructure.*;

import java.util.Random;

public class Utility<T> {
		Scanner scanner;
		Random random;

		public Utility() {
			scanner = new Scanner(System.in);
			random = new Random();

		}

		public int inputRandom(int bound) {
			try {
				return random.nextInt(bound);
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}

		public int inputRandom() {
			try {
				return random.nextInt();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}

		public String inputString() {
			try {
				return scanner.next();
			} catch (Exception e) {
				System.out.println(e);
			}
			return "";
		}

		public String inputStringLine() {
			try {
				return scanner.nextLine();
			} catch (Exception e) {
				System.out.println(e);
			}
			return "";
		}

		public int inputInteger() {
			try {
				return scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}
		
		public double inputDouble() {
			try {
				return scanner.nextDouble();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}

		public boolean inputBoolean() {
			try {
				return scanner.nextBoolean();
			} catch (Exception e) {
				System.out.println(e);
			}
			return false;
		}

		public static void calender(int month, int year) {
			int year1, month1, x, day = 1, day1;
			year1 = year - (14 - month) / 12;
			x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
			month1 = month + 12 * ((14 - month) / 12) - 2;
			day1 = (day + x + (31 * month1) / 12) % 7;
			String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
					"October", "November", "December" };
			int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int monthDay = 0;
			for (int i = 0; i < monthDays.length; i++) {
				if (i == month - 1) {
					monthDay = monthDays[i];
				}
			}
			int[][] totalDays = new int[6][7];
			boolean leap = leapYear(year);
			if (leap && month == 1) {
				monthDay = 29;
			}
			int z = 1;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (i == 0 && j < day1) {
						totalDays[i][j] = -1;
					} else if (z <= monthDay) {
						totalDays[i][j] = z;
						z++;
					} else {
						totalDays[i][j] = -1;
					}
				}
			}
			for (int i = 0; i < 12; i++) {
				if (month == i + 1) {
					System.out.print(monthName[i] + " " + year);
				}
			}
			System.out.println();
			String[] dayName = { "S", "M", "T", "W", "T", "F", "S" };
			for (int i = 0; i < 7; i++) {
				System.out.print(dayName[i] + "  ");
			}
			System.out.println();
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (totalDays[i][j] != -1) {
						if (totalDays[i][j] < 10)
							System.out.print(totalDays[i][j] + "  ");
						else
							System.out.print(totalDays[i][j] + " ");
					} else
						System.out.print("   ");
				}
				System.out.println();
			}
		}

		public static int[][] calenderQueue(int month, int year) {
			int year1, month1, x, day = 1, day1;
			year1 = year - (14 - month) / 12;
			x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
			month1 = month + 12 * ((14 - month) / 12) - 2;
			day1 = (day + x + (31 * month1) / 12) % 7;
			String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
					"October", "November", "December" };
			int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int monthDay = 0;
			for (int i = 0; i < monthDays.length; i++) {
				if (i == month - 1) {
					monthDay = monthDays[i];
				}
			}
			int[][] totalDays = new int[6][7];
			boolean leap = leapYear(year);
			if (leap && month == 1) {
				monthDay = 29;
			}
			int z = 1;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (i == 0 && j < day1) {
						totalDays[i][j] = -1;
					} else if (z <= monthDay) {
						totalDays[i][j] = z;
						z++;
					} else {
						totalDays[i][j] = -1;
					}
				}
			}
			for (int i = 0; i < 12; i++) {
				if (month == i + 1) {
					System.out.print(monthName[i] + " " + year);
				}
			}
			System.out.println();
			return totalDays;
		}

		public static boolean leapYear(int year) {
			if (year % 100 != 0 && year % 4 == 0) {
				return true;
			} else if (year % 100 == 0 && year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}

		public static void prime2DArray() {
			int[][] array = new int[10][100];
			int[][] prime = new int[10][100];
			int z = 1;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 100; j++) {
					array[i][j] = z;
					z++;
				}
			}
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 100; j++) {
					if (isPrime(array[i][j])) {
						prime[i][j] = array[i][j];
					} else {
						prime[i][j] = -1;
					}
				}
			}
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 100; j++) {
					if (prime[i][j] != -1)
						System.out.print(prime[i][j] + " ");
				}
				System.out.println();
			}
		}

		private static boolean isPrime(int number) {
			int count = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 0)
				return true;
			else
				return false;
		}

		private static String st;

		public static void unOrderedList(String userInput) throws Exception {
			LinkedList<String> list = new LinkedList<String>();
			File file = new File("/home/user/Pratiksha/DataStructure/DataStructure/src/com/bridgelabzs/datastructure/unorderedlist.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			while ((st = br.readLine()) != null) {
				str = str + st+" ";
			}
			br.close();
			for (String fileString : str.split(" ")) {
				list.add(fileString);
			}
			System.out.println("Before Search");
			System.out.println("=====");
			list.display();
			boolean b = list.search(userInput);
			if (b) {
				list.remove(userInput);
			} else {
				list.add(userInput);
			}
			System.out.println("=====");
			System.out.println("After Search");
			System.out.println("=====");
			list.display();
			list.write();

		}

		static String stint;
		public static void orderedList(String searchItem) throws Exception {
			LinkedList<String> list = new LinkedList<String>();
			File file = new File("/home/user/Pratiksha/DataStructure/DataStructure/src/com/bridgelabzs/datastructure/orderlist.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			while ((stint = br.readLine()) != null) {
				str = str + stint+" ";
			}
			br.close();
			for (String fileInt : str.split(",")) {
				list.add(fileInt);
			}
			System.out.println("Before Search");
			System.out.println("=====");
			list.display();
			boolean b = list.search(searchItem);
			if (b) {
				list.remove(searchItem);
			} else {
				list.add(searchItem);
			}
			System.out.println("=====");
			System.out.println("After Search and sort");
			System.out.println("=====");
			list.display();
			list.write();
			
		}

		@SuppressWarnings("rawtypes")
		static Utility utility = new Utility();

		public int bankCashCounter(int numberOfPeople) {
			int cashBalance = 1000000;
			int testCases = numberOfPeople;
			MyQueue<Integer> queue = new MyQueue<Integer>(numberOfPeople);
			for (int i = 0; i < numberOfPeople; i++)
				queue.enqueue(i);
			while (testCases > 0) {
				System.out.println("Bank Cash : "+cashBalance);
				int count = 0, option = 0;

				while (count == 0) {

					System.out.println("1. for Withdrawal \n2. for Deposit");
					option = utility.inputInteger();
					if (option == 1 || option == 2)
						count++;
				}
				if (option == 1) {
					int amount = 0;
					int countWithdrawal = 0;
					while (countWithdrawal == 0) {
						System.out.println("Enter the amount ");
						amount = utility.inputInteger();
						if (amount > cashBalance) 
							System.out.println("Sorry we don't have required cash\nvisit another day");
						else
							cashBalance = cashBalance - amount;
						countWithdrawal++;
					}
					
					queue.dequeue();
				} else if (option == 2) {
					int amount = 0;
					int countDeposit = 0;
					while (countDeposit == 0) {
						System.out.println("Enter the amount to deposit");
						amount = utility.inputInteger();
						countDeposit++;
					}
					cashBalance = cashBalance + amount;
					queue.dequeue();
				}
				testCases--;
			}
			return cashBalance;
		}

		public static boolean palindromeChecker(String word) {
			MyDeque<Character> dq = new MyDeque<Character>();
			char[] c = word.toCharArray();
			for (int i = 0; i < c.length; i++) {
				dq.addFront(c[i]);
			}

			String s = "";
			for (int i = 0; i < c.length; i++) {
				Node<Character> ch = dq.removeFront();
				s = s + ch.data;
			}
			System.out.println(s);
			if (s.equals(word))
				return true;
			else
				return false;
		}

		public static boolean prime(int number) {
			int count = 0;
			for (int j = 2; j <= number / 2; j++) {
				if (number % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				return true;
			} else
				return false;
		}

		public static void primeAnagram2DArray(int[] prime) {
			boolean z;
			int count = 0, countAna = 0;
			for (int i = 0; i < prime.length; i++) {
				for (int j = i + 1; j < prime.length; j++) {
					z = numberCheck(prime[i], prime[j]);

					if (z && count == 0) {
						countAna++;
						count++;
						z = false;
					}

				}
				if (count > 0) {
					countAna++;
					count = 0;
				}
			}
			int[] anagramTotal = new int[countAna];
			int x = 0;
			for (int i = 0; i < prime.length; i++) {
				for (int j = i + 1; j < prime.length; j++) {
					z = numberCheck(prime[i], prime[j]);

					if (z && count == 0) {
						anagramTotal[x] = prime[j];
						x++;
						count++;
						z = false;
					}

				}
				if (count > 0) {
					anagramTotal[x] = prime[i];
					x++;
					count = 0;
				}
			}

			for (int i = 0; i < anagramTotal.length; i++) {
				for (int j = 0; j < anagramTotal.length - 1; j++) {
					if (anagramTotal[j] > anagramTotal[j + 1]) {
						int temp = anagramTotal[j];
						anagramTotal[j] = anagramTotal[j + 1];
						anagramTotal[j + 1] = temp;
					}
				}
			}

			for (int i = 0; i < anagramTotal.length; i++) {
				for (int j = 0; j < anagramTotal.length - 1; j++) {
					if (anagramTotal[j] == anagramTotal[j + 1]) {
						anagramTotal[j + 1] = -1;
					}
				}
			}
			int positive = 0;
			for (int i = 0; i < anagramTotal.length; i++) {
				if (anagramTotal[i] != -1) {
					positive++;
				}
			}
			int[] ana = new int[positive + 1];
			int zz = 1;
			int yy = 0;
			for (int i = 0; i < anagramTotal.length; i++) {
				if (anagramTotal[i] != -1) {
					ana[yy] = anagramTotal[i];
					yy++;
				}
			}

			int[][] total = new int[10][100];
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 100; j++) {
					total[i][j] = zz;
					zz++;
				}
			}
			int xx = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 100; j++) {
					if (ana[xx] == total[i][j] && xx < ana.length) {
						total[i][j] = ana[xx];
						xx++;
					} else {
						total[i][j] = -1;
					}
				}
			}
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 100; j++) {
					if (total[i][j] != -1) {
						System.out.print(total[i][j] + " ");
					}
				}
				System.out.println();
			}
		}
		
		public static boolean numberCheck(int valueOne, int valueTwo) {
			String a = Integer.toString(valueOne);
			String b = Integer.toString(valueTwo);
			char c[] = a.toCharArray();
			char d[] = b.toCharArray();
			a = arrange(c);
			b = arrange(d);
			return a.equals(b);
		}

		public static String arrange(char[] c) {
			String s = "";
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length - 1; j++) {
					if (c[j] > c[j + 1]) {
						char temp = c[j];
						c[j] = c[j + 1];
						c[j + 1] = temp;
					}
				}
			}
			for (int i = 0; i < c.length; i++) {
				s = s + c[i];
			}
			return s;
		}

		public static void primeAnagramLinkedListStack(int[] prime) {
			boolean z;
			int count = 0, countAna = 0;
			for (int i = 0; i < prime.length; i++) {
				for (int j = i + 1; j < prime.length; j++) {
					z = numberCheck(prime[i], prime[j]);

					if (z && count == 0) {
						countAna++;
						count++;
						z = false;
					}

				}
				if (count > 0) {
					countAna++;
					count = 0;
				}
			}
			int[] anagramTotal = new int[countAna];
			int x = 0;
			for (int i = 0; i < prime.length; i++) {
				for (int j = i + 1; j < prime.length; j++) {
					z = numberCheck(prime[i], prime[j]);

					if (z && count == 0) {
						anagramTotal[x] = prime[j];
						x++;
						count++;
						z = false;
					}

				}
				if (count > 0) {
					anagramTotal[x] = prime[i];
					x++;
					count = 0;
				}
			}

			for (int i = 0; i < anagramTotal.length; i++) {
				for (int j = 0; j < anagramTotal.length - 1; j++) {
					if (anagramTotal[j] > anagramTotal[j + 1]) {
						int temp = anagramTotal[j];
						anagramTotal[j] = anagramTotal[j + 1];
						anagramTotal[j + 1] = temp;
					}
				}
			}

			for (int i = 0; i < anagramTotal.length; i++) {
				for (int j = 0; j < anagramTotal.length - 1; j++) {
					if (anagramTotal[j] == anagramTotal[j + 1]) {
						anagramTotal[j + 1] = -1;
					}
				}
			}
			int positive = 0;
			for (int i = 0; i < anagramTotal.length; i++) {
				if (anagramTotal[i] != -1) {
					positive++;
				}
			}
			int[] ana = new int[positive + 1];
			int zz = 1;
			int yy = 0;
			for (int i = 0; i < anagramTotal.length; i++) {
				if (anagramTotal[i] != -1) {
					ana[yy] = anagramTotal[i];
					yy++;
				}
			}
			LinkedStack<Integer> listStack = new LinkedStack<Integer>();
			for (int i = 0; i < ana.length - 1; i++) {
				listStack.add(ana[i]);
			}
			listStack.display();
		}

		public static void primeAnagramLinkedListQueue(int[] prime) {
			boolean z;
			int count = 0, countAna = 0;
			for (int i = 0; i < prime.length; i++) {
				for (int j = i + 1; j < prime.length; j++) {
					z = numberCheck(prime[i], prime[j]);

					if (z && count == 0) {
						countAna++;
						count++;
						z = false;
					}

				}
				if (count > 0) {
					countAna++;
					count = 0;
				}
			}
			int[] anagramTotal = new int[countAna];
			int x = 0;
			for (int i = 0; i < prime.length; i++) {
				for (int j = i + 1; j < prime.length; j++) {
					z = numberCheck(prime[i], prime[j]);
					if (z && count == 0) {
						anagramTotal[x] = prime[j];
						x++;
						count++;
						z = false;
					}

				}
				if (count > 0) {
					anagramTotal[x] = prime[i];
					x++;
					count = 0;
				}
			}

			for (int i = 0; i < anagramTotal.length; i++) {
				for (int j = 0; j < anagramTotal.length - 1; j++) {
					if (anagramTotal[j] > anagramTotal[j + 1]) {
						int temp = anagramTotal[j];
						anagramTotal[j] = anagramTotal[j + 1];
						anagramTotal[j + 1] = temp;
					}
				}
			}

			for (int i = 0; i < anagramTotal.length; i++) {
				for (int j = 0; j < anagramTotal.length - 1; j++) {
					if (anagramTotal[j] == anagramTotal[j + 1]) {
						anagramTotal[j + 1] = -1;
					}
				}
			}
			int positive = 0;
			for (int i = 0; i < anagramTotal.length; i++) {
				if (anagramTotal[i] != -1) {
					positive++;
				}
			}
			int[] ana = new int[positive + 1];
			int zz = 1;
			int yy = 0;
			for (int i = 0; i < anagramTotal.length; i++) {
				if (anagramTotal[i] != -1) {
					ana[yy] = anagramTotal[i];
					yy++;
				}
			}
			LinkedQueue<Integer> listQueue = new LinkedQueue<Integer>();
			for (int i = 0; i < ana.length - 1; i++) {
				listQueue.add(ana[i]);
			}
			listQueue.display();
		}

		public static double numberOfBinarySearchTree(double totalNodes) {
			double numerator = factorial(2 * totalNodes);
			double denominator = (factorial(totalNodes + 1)) * (factorial(totalNodes));
			double differentTrees = numerator / denominator;
			return differentTrees;
		}

		public static double factorial(double i) {
			double fact = 1;
			while (i > 0) {
				fact = fact * i;
				i--;
			}
			return fact;
		}
	}

