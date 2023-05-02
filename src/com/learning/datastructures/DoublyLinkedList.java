package com.learning.datastructures;

import java.util.Scanner;

public class DoublyLinkedList {

    DLLNode head = new DLLNode();
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        populateValues(dll);
        print(dll);
        insertEnd(dll);
        print(dll);
        insertBegin(dll);
        print(dll);
        insertMid(dll);
        print(dll);
    }
    public static void populateValues(DoublyLinkedList dll) {
        int n = getValue("Enter the size of the list: ");
        DLLNode temp = dll.head;
        for(int i=0; i<n; i++) {
            int val = getValue("Enter the value: ");
            if(i == 0) {
                temp.data = val;
            } else {
                DLLNode node = new DLLNode(val);
                temp.next = node;
                node.prev = temp;
                temp = node;
            }
        }
    }
    public static int getValue(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        int val = scanner.nextInt();
        return val;
    }
    public static void print(DoublyLinkedList dll) {
        System.out.println("-----");
        DLLNode dNode = dll.head;
        while(dNode != null) {
            System.out.print(dNode.data + " -> ");
            dNode = dNode.next;
        }
        System.out.println("");

    }
    public static void insertEnd(DoublyLinkedList dll) {
        int val = getValue("Enter the value to insert at the end: ");
        DLLNode dlNode = dll.head;
        while(dlNode.next != null) {
            dlNode = dlNode.next;
        }
        DLLNode currNode = new DLLNode(val);
        dlNode.next = currNode;
        currNode.prev = dlNode;
        dlNode = currNode;
    }
    public static void insertBegin(DoublyLinkedList dll) {
        int val = getValue("Enter the value to insert at the beginning: ");
        DLLNode currNode = new DLLNode(val);
        currNode.next = dll.head;
        dll.head.prev = currNode;
        dll.head = currNode;
    }
    public static void insertMid(DoublyLinkedList dll) {
        int val = getValue("Enter the value to insert in the middle: ");
        DLLNode currNode = new DLLNode(val);
        DLLNode temp = dll.head;
        int size=0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        temp = dll.head;
        int mid = (size%2 == 0) ? size/2 : ((size/2)+1);
        for(int i = 1; i<mid; i++) {
            temp = temp.next;
        }
        currNode.prev = temp;
        currNode.next = temp.next;
        temp.next = currNode;
    }
}
