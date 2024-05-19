package com.ass.q4;



public class List {
   
    static class Node{
		private int data;
		private Node next;
	
		public Node(int val){
			data  = val;
			next =  null;
	
		}
	}
	private Node head;
	public List() {
		head = null;
	}
	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int val) {
		Node nn = new Node(val);
		nn.next = head;
		head = nn;
	}
	
	public void addLast(int val) {
		Node nn = new Node(val);
		Node tail = head;
		if(isEmpty())
			head = nn;
		else {
			while(tail.next != null) {
				tail = tail.next;
			}
			tail.next = nn;
		}
	} 

    
      
  
     public void display() {
 		
 		Node curr = head;
 		Node prev = null;
 		Node temp;
 		
 		while( curr != null) {
 			temp = curr.next;
 			curr.next = prev;
 			prev = curr;
 			curr = temp;
 		}
// 		head = prev;
 		System.out.print("List ::");
 		while(prev != null) {
 		
 		  System.out.print(" "+prev.data);
 		  prev = prev.next;
 		  
 		}
 	}
}