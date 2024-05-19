package com.sunbeam.q1;

import java.util.Arrays;

import com.sunbeam.q1.q1.Stack;


public class q3 {
	public static class Stack {
		private int arr1[];
		private int top;
		private final int SIZE;
		public Stack(int size) {
			SIZE = size;
			arr1 = new int[SIZE];
			 top = -1;	
		}
		
		public void push(int value) {
			 if (!isFull()) {
				 top++;
	             arr1[top] = value;
	          } else {
	                System.out.println("Stack is full");
	         }
			
			
		}
		
		public int pop() {
			int ans = 0;
			if(!isEmpty()) {
				ans = arr1[top];
				top--;
			}
			 else {
	                System.out.println("Stack is empty");
	         }
			return ans;
			 
		}
		
		public int peek() {
		
			return arr1[top];
		}
		
		public boolean isFull() {
			return top == SIZE-1;
		}
		
		public boolean isEmpty() {
			return top == -1;
		}
	
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {21,45,32,56,78,89};
		int n = arr.length;
		Stack q = new Stack(n);
		for(int i = 0; i<n; i++) {
			q.push(arr[i]);
		}
		int i = 0;
		while(!q.isEmpty()){
			
			  arr[i] = q.pop();
			  i++;
		
			
		}
	    System.out.println(Arrays.toString(arr));
	}
	 
}
