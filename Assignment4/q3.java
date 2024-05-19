package com.ass.q3;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insert a new node before a given node
		List l1 = new List();
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		//10 -> 20 -> 30 -> 40
		
		l1.addLast(50);
		l1.addLast(60);
		l1.addAfter(25, 30);
		l1.addBefore(35, 40);
		l1.addBefore(15, 20);
		l1.display();

	}

}
