package com.ass.q5;


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
	
//	public void addLast(int val) {
//		Node nn = new Node(val);
//		Node tail = head;
//		if(isEmpty())
//			head = nn;
//		else {
//			while(tail.next != null) {
//				tail = tail.next;
//			}
//			tail.next = nn;
//		}
//	} 

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
      /*
      public void addValSorted(int val) {
    	  Node nn = new Node(val);
    	  if(isEmpty()) {
    		 head = nn; 
    	  }
    	  else {
    		 
    		  if(head.next == null) {
    			  if(head.data > val) {
    				  nn.next = head;
    				  head = nn;
    				  return;
    				 
    			  }
    			  else {
    				  head.next = nn;
    				
    			  }
    		  }
    		  Node trav = head;
    		Node prev = null;
    		  while(trav.next != null) {
    			  if(trav.next.data > val) {
    				 nn.next = trav.next; 
    				 trav.next = nn;
    				 trav = nn;
    			     break;
    			  }else if(trav.next.data < val) {
    				  trav = trav.next;
    				  trav.next = nn;
//    				  trav.next  = nn;
//    				  trav = trav.next;
//    				  trav = nn;
    				 break;
    				  
    			  }
    			
    		  }
//    		  while(trav != null && trav.data < val) {
//    			  prev =  trav;
//    			  trav = trav.next;
//    		  }
//    		  prev.next = nn;
//    		  prev = nn;
    	  }
      }
  */
      
      public void addValSorted(int val) {
    	  Node newnode = new Node(val);
    	  if(isEmpty()) {
    		  head = newnode;
    	  }
    	  else {
    		  Node trav = head;
    		  Node prev = null;
    		  while(trav != null && trav.data < val) {    			  
    			  prev = trav;
    			  trav = trav.next;
    		  }
    		  newnode.next = trav;
    		  if(prev == null)
    			  head = newnode;
    		  else
    			  prev.next = newnode;
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
