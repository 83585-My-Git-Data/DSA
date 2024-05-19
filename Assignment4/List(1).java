package com.ass.q2;


public class List {
    static class Node {
    	private int data;
    	private Node prev;
    	public Node(int val) {
    		data  = val;
    		prev = null;
    		
    	}
    }
    private Node tail;

    public List() {
    	tail = null;
    	
    }
    public boolean isEmpty() {
    	return tail == null;
    }
    public void addFirst(int val) {
    	Node nn = new Node(val);
    	Node head = tail;
    	if(isEmpty()) {
    		  tail = nn;
    		nn.prev = tail;
    	}
    	else {
    		Node trav = head;
    		while(trav.prev != tail) {
    			trav = trav.prev;
    		}
    		trav.prev = nn;
    		nn.prev = tail;
    		System.out.print(" " + trav.data);
    		
    	}
    }
    public void addLast(int val) {
    	Node nn = new Node(val);
    	if(isEmpty()) {
    		 tail = nn;
     		nn.prev = tail;
    	}
    	else {
    		Node trav = tail;
    		while(trav.prev != tail) {
    			trav = trav.prev;
    		}
    		nn.prev = tail;
    		trav.prev = nn;
    		tail = trav.prev;
    		
    		System.out.print(" " + trav.data);
    	}
    	
    }
    public void delFirst() {
    	if(!isEmpty()) {
    		
    		Node trav = tail;
    		while(trav.prev.prev != tail) {
    			trav = trav.prev;
    		}
    		trav.prev = tail;
    		
    	}
    }
   
    public void display() {
    	Node trav = tail;
 		System.out.print("List :: ");
 		while(trav != tail) {
 		
 			System.out.print(" " + trav.data);
 		
 			tail = trav.prev;
 		}
 		System.out.println("helloo");
    }
}
