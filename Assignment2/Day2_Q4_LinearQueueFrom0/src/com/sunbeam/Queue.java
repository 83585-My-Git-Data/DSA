package com.sunbeam;

public class Queue {
	private int arr[];
	private int rear, front;
	private int SIZE;
	
	Queue(int size){
		SIZE = size;
		arr = new int[SIZE];
		rear = 0;
		front = 0;
	}
	
	public void push(int value) {
		arr[rear] = value;
		rear++;
	}
	
	public void pop() {
		front++; 
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isFull() {
		return rear == SIZE - 1 ;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
}
