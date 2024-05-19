
package com.sunbeam.q1;
import java.util.Scanner;


public class q1 {
	 public static class Stack {
		private int arr[];
		private int top;
		private final int SIZE;
		public Stack(int size) {
			SIZE = size;
			arr = new int[SIZE];
		    top = SIZE;
		}
		
		public void push(int value) {
			
			top--;
			arr[top] = value;
		}
		
		public int pop() {
			return arr[top++];
		}
		
		public int peek() {
			//1. read and return data from front end
			return arr[top];
		}
		
		public boolean isFull() {
			return top == -1;
		}
		
		public boolean isEmpty() {
			return top == SIZE;
		}
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack q = new Stack(4);
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
	;
		while(!q.isEmpty()) {
			System.out.println("value "+q.peek());
			q.pop();
		}
	
	}

	}

}


