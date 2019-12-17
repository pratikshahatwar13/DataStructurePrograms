package com.bridgelabzs.datastructure;

public class Stack<T> {

	T[] c;
	int length;
	int top;
	@SuppressWarnings("unchecked")
	public Stack(int length) {
		this.length=length;
		c = (T[]) new Object[length];
		top=0;
	}
	public void push(T d) {
		c[top]=d;
		top++;
	}
	public T pop() {
		return c[top--];
	}
	public boolean isEmpty() {
		if(top==0) {
			return true;
		}
		else 
			return false;
	}
	public int size() {
		return top;
	}
	public T peek() {
		return c[top];
	}
}
