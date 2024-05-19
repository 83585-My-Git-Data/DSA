package com.ass.q1;

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
    	public void delFirst() {
    		if(!isEmpty()) {
    		 head = head.next;
    		}
    	}	
         public void delLast() {
        	 Node tail = head;
        	if(tail.next.next == null) {
        		head.next =null;
        	}
        	 while(tail.next.next != null) {
        		 tail = tail.next;
        	 }
        	 tail.next = null;
        	 
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
