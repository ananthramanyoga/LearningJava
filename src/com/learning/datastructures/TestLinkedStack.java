package com.learning.datastructures;

public class TestLinkedStack {
     public static void main(String[] args) {
         LinkedStack ls = new LinkedStack();
         ls.push(10);
         ls.push(20);
         ls.push(30);
         ls.push(40);
         ls.push(50);
         ls.push(60);
         ls.print();
         ls.pop();
         ls.print();
         ls.peek();
         ls.pop();
         ls.peek();
         ls.print();
     }
}
