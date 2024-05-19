package com.ass.q3;

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

     public void addBefore(int val, int key) {
    	Node nn = new Node(val);
    	Node trav = head;
    	if(head != null && head.data == key) {
    		nn.next = head;
    		head = nn;
    		return;
    	}
    	while(trav != null && trav.next != null) {
    		if(trav.next.data == key) {
    			nn.next =  trav.next;
    			trav.next = nn;
    			return;
    		}
    		trav = trav.next;
    	}
    	 
     }
      public void addAfter(int val, int key) {
       Node nn = new Node(val);
      	Node trav = head;
      	if(head.next == null) {
      		head.next = nn;
      		
      	}
      	while(trav != null) {
      		if(trav.data == key) {
      			nn.next = trav.next;
      			trav.next = nn;
      		}
      		trav = trav.next;
      	}
    	 
     }
  
     public void display() {
 		
 		Node tail = head;
 		System.out.print("List :: ");
 		while(tail != null) {
 		
 			System.out.print(" " + tail.data);
 		
 			tail = tail.next;
 		}
 		System.out.println("");
 	}
}
