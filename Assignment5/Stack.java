package com.sunbeam;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    private Node top;
    
    public Stack() {
        this.top = null;
    }
    
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
}
