package com.sunbeam.q1;

import java.util.Scanner;



public class q2 {
	 public static class Stack {
			private int arr[];
			private int top;
			private final int SIZE;
			private int maxm;
			public Stack(int size) {
				SIZE = size;
				arr = new int[SIZE];
				int top = -1;
				maxm = 0;
				
			}
			
			public void push(int value) {
				
				top++;
				if(maxm < value) {
					maxm = value;
				}
				arr[top] = value;
				
			}
			
			public int pop() {
				
				return arr[top--];
			}
			
			public int peek() {
				//1. read and return data from front end
				return arr[top];
			}
			
			public boolean isFull() {
				return top == SIZE-1;
			}
			
			public boolean isEmpty() {
				return top == -1;
			}
			public int maximumValue() {
				return maxm;
			}
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack q = new Stack(5);
		int choice;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\n4 maximum value in stack");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(q.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("pop value "+q.pop());
				break;
			case 3:
				if(q.isEmpty()) {
					System.out.println("Stack is empty");
				}
				else {
					System.out.println("Peeked value : " + q.peek());
				}
				break;
			
			case 4:
				System.out.println("maximum value "+q.maximumValue());
				break;
			default:
				System.out.println("invalid option");
				break;
			}
		}while(choice != 0);
		sc.close();
		}
	}
	 }



	