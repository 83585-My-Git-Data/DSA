package com.sunbeam;

public class DequeTester {
    public static void main(String[] args) {
        Deque deque = new Deque();
        
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);
        
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        
        System.out.println("Deque empty: " + deque.isEmpty());
    }
}
