package com.leetcode;

import java.util.LinkedList;
import java.util.Scanner;

public class AddTwoNumbersInList {
    public static void main(String args[]) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        populateValues(list1);
        populateValues(list2);

        printValues(list1);
        printValues(list2);
        if(list1.size()>list2.size()) {
            addValues(list1, list2);
        } else {
            addValues(list2, list1);
        }
    }
    public static void populateValues(LinkedList li) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int len = sc.nextInt();
        for(int i = 0; i < len; i++) {
            System.out.println("Enter the number: ");
            li.add(sc.nextInt());
        }
    }
    public static void printValues(LinkedList li) {
        System.out.println("size of the list: " + li.size());
        for(Object val : li) {
            System.out.println(val);
        }
    }
    public static void addValues(LinkedList li1, LinkedList li2) {
        LinkedList<Integer> li3 = new LinkedList<>();
        int carry = 0;
        for(int i = 0; i < li1.size();  i++) {
            int l2Val = li2.size() > i ? (Integer) li2.get(i) : 0;
            int sum = (Integer) li1.get(i) + l2Val + carry;
            if(sum >= 10) {
                carry = 1;
                li3.add((sum%10));
            } else {
                li3.add(sum);
                carry=0;
            }
        }
        printValues(li3);
    }
}
