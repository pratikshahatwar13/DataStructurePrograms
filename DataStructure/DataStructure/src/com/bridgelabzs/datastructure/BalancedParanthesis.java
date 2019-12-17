package com.bridgelabzs.datastructure;
import com.bridgelabzs.utility.*;
public class BalancedParanthesis {
	public static void main(String[] args) {
    System.out.println("Enter the Arithmetic Expression:");
	Utility utility = new Utility();
	String input = utility.inputString();
	char[] c = input.toCharArray();
	Stack<Character> stack = new Stack<Character>(c.length);
	for(int i=0;i<c.length;i++) {
		if(c[i]=='(') {
			stack.push(c[i]);
		}
		else if(c[i]==')') {
			stack.pop();
		}else if(c[i]=='{') {
			stack.push(c[i]);
		}else if(c[i]=='}') {
			stack.pop();
		}
		else if(c[i]=='[') {
			stack.push(c[i]);
		}
		else if(c[i]==']') {
			stack.pop();
		}
	}
	boolean b = stack.isEmpty();
	
	if(b) {
		System.out.println("Parentheses are Balanced");
	}
	else {
		System.out.println("Parentheses are Not Balanced");
	}
  }
}
