package com.learning.datastructures;

public class TestLinkedQueue {
    public static void main(String[] args) {
        LinkedQueue ls = new LinkedQueue();
        ls.enQueue(10);
        ls.enQueue(20);
        ls.enQueue(30);
        ls.enQueue(40);
        ls.enQueue(50);
        ls.enQueue(60);
        ls.print();
        ls.deQueue();
        ls.print();
        ls.deQueue();
        ls.deQueue();
        ls.print();
    }
}
