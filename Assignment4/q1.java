package com.ass.q1;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l1 = new List();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		//10 -> 20 -> 30 -> 40
		
		l1.addLast(50);
		l1.addLast(60);
		l1.delLast();

		
		l1.display();

	}

}
