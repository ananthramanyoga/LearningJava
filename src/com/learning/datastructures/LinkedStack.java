package com.learning.datastructures;

import com.leetcode.google.linkedlists.ListNode;

public class LinkedStack {
    ListNode top;
    int length = 0;

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public void pop() {
        if(length == 0) {
            System.out.println("Stack Underflow");
        } else {
            top = top.next;
            length--;
        }
    }

    public void peek() {
        System.out.println("The top of the stack is: " + top.val);
    }

    public void print() {
        System.out.println("Size of the stack: " + length);
        ListNode temp = top;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
