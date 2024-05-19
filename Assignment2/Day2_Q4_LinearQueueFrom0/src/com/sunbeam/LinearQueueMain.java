package com.sunbeam;

import java.util.Scanner;

public class LinearQueueMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue(4);
		int choice;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thankyou");
				break;
			case 1:
				if (q.isFull()) {
					System.out.println("Queue is full");
				} else {
					System.out.print("Enter the value you want to insert");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
			case 2:
				if (q.isEmpty()) {
					System.out.println("Queue is Empty");
				} else {
					q.pop();
					System.out.println("element is popped");
				}
				break;
			case 3:
				if (q.isEmpty()) {
					System.out.println("Array is Empty");
				} else {
					System.out.println("The element is " + q.peek());
				}
				break;
			default:
				System.out.println("Valid choice");
				break;
			}

		} while (choice != 0);
		sc.close();
	}
}
