package com.bridgelabzs.datastructure;

	public class Node<T> {
		public Node<T> next;
		public T data;
		public Integer key;
		public Node(T data) {
			this.data=data;
		}
		public Node(Integer key, T data) {
			this.key=key;
			this.data=data;
		}
	}

