package com.learning.datastructures;

public class SLLNode {
    int data;
    SLLNode next;
    SLLNode() {

    }
    SLLNode(int data) {
        this.data = data;
    }
    SLLNode(int data, SLLNode next) {
        this.data = data;
        this.next = next;
    }
}
