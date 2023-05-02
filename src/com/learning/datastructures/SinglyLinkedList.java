package com.learning.datastructures;

import java.util.Scanner;

public class SinglyLinkedList {
    SLLNode head;
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        populateList(sl);
        display(sl);
        insertEnd(sl);
        System.out.println("----List after insertion at the end----");
        display(sl);
        insertBegin(sl);
        System.out.println("----List after insertion at the beginning----");
        display(sl);
        insertMid(sl);
        System.out.println("----List after insertion at the Mid----");
        display(sl);
    }
    public static void populateList(SinglyLinkedList sl) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sn.nextInt();
        SLLNode temp = sl.head;
        for(int i=0; i<n; i++) {
            System.out.println("Enter the value: ");
            int val = sn.nextInt();
            if(i == 0) {
                sl.head = new SLLNode(val, null);
                temp = sl.head;
            } else {
                temp.next = new SLLNode(val, null);
                temp = temp.next;
            }
        }
    }
    public static void insertEnd(SinglyLinkedList sl) {
        SLLNode lNode = sl.head;
        Scanner sn = new Scanner(System.in);
        System.out.println("\nEnter the value: ");
        int val = sn.nextInt();
        while(lNode.next != null) {
            lNode = lNode.next;
        }
        lNode.next = new SLLNode(val,null);
    }
    public static void insertBegin(SinglyLinkedList sl) {
        SLLNode lNode = sl.head;
        Scanner sn = new Scanner(System.in);
        System.out.println("\nEnter the value: ");
        int val = sn.nextInt();
        sl.head = new SLLNode(val);
        sl.head.next = lNode;
    }
    public static void insertMid(SinglyLinkedList sl) {
        Scanner sn = new Scanner(System.in);
        System.out.println("\nEnter the value: ");
        int val = sn.nextInt();
        SLLNode lNode = sl.head;
        int size = 1;
        while(lNode.next != null) {
            lNode = lNode.next;
            size++;
        }
        int mid = 0;
        if(size % 2 != 0) {
            mid = size/2 +  1;
        } else {
            mid = size/2;
        }
        lNode = sl.head;
        for(int i = 1; i<mid; i++) {
            lNode = lNode.next;
        }
        SLLNode newNode = new SLLNode(val);
        newNode.next = lNode.next;
        lNode.next = newNode;
    }
    public static void display(SinglyLinkedList sl) {
        SLLNode lNode = sl.head;
        while(lNode != null) {
            System.out.print(lNode.data + " -> ");
            lNode= lNode.next;
        }
    }
}
