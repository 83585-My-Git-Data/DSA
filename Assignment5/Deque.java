package com.sunbeam;

class DNode {
    int data;
    DNode next;
    DNode prev;
    
    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Deque {
    private DNode head;
    private DNode tail;
    
    public Deque() {
        this.head = null;
        this.tail = null;
    }
    
    public void addFirst(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    public void addLast(int data) {
        DNode newNode = new DNode(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        return data;
    }
    
    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        int data = tail.data;
        tail = tail.next;
        if (tail == null) {
            head = null;
        } else {
            tail.prev = null;
        }
        return data;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
}
