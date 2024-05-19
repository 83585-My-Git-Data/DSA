package com.sunbeam;

public class StackTester {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element is: " + stack.peek());
        
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());
        
        System.out.println("Stack empty: " + stack.isEmpty());
    }
}
