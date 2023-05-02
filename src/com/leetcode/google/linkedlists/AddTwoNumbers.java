package com.leetcode.google.linkedlists;

import java.util.Scanner;

public class AddTwoNumbers {
    ListNode l1 = new ListNode();
    ListNode l2 = new ListNode();

    public static void main(String[] args) {
        AddTwoNumbers addT = new AddTwoNumbers();
        populateList(addT.l1);
        populateList(addT.l2);
        printList(addT.l1);
        printList(addT.l2);
        ListNode sum = addTwoNumbers(addT.l1, addT.l2);
        printList(sum);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =  0;
        ListNode dummyHead = new ListNode();
        ListNode sumList = dummyHead;
        while(l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            sumList.next = new ListNode(sum % 10);
            sumList = sumList.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }

    public static void populateList(ListNode l3) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of list: ");
        int l1Size = s.nextInt();
        for (int i = 0; i < l1Size; i++) {
            System.out.println("Enter the value: ");
            int val = s.nextInt();
            if (i == 0) {
                l3.val = val;
            } else {
                ListNode node = new ListNode(val);
                ListNode last = l3;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = node;
            }
        }
    }

    public static void printList(ListNode l4) {
        while(l4 != null) {
            System.out.print(l4.val + " -> ");
            l4 = l4.next;
        }
        System.out.println("");
    }

}