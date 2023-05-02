package com.learning.datastructures;

import com.leetcode.google.linkedlists.ListNode;

public class LinkedQueue {
    int length;
    ListNode head;
    ListNode tail;

    public LinkedQueue() {
        this.head = this.tail = null;
    }

    public void enQueue(int data) {
        ListNode temp = new ListNode(data);
        if(head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
    public void deQueue() {
        if(head == null) {
            System.out.println("No elements in the queue");
        } else {
            System.out.println("Removed first node: " + head.val);
            head = head.next;
        }
    }

    public void print() {
        System.out.println("Size of the Queue: " + length);
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("");
    }

}
