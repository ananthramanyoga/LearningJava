package com.leetcode.google.linkedlists;

import java.util.Scanner;

public class RemoveNthNode {
    public static void main(String[] args) {
        AddTwoNumbers addT = new AddTwoNumbers();
        AddTwoNumbers.populateList(addT.l1);
        AddTwoNumbers.printList(addT.l1);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int n = s.nextInt();
        removeNthFromEnd1Pass(addT.l1, n);
        AddTwoNumbers.printList(addT.l1);
    }
    public static void removeNthFromEnd2Pass(ListNode head, int n) {
        ListNode temp = head;
        int length =0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        int delIndex = length - n;
        temp = head;
        for(int i=1; i<delIndex; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void removeNthFromEnd1Pass(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for(int i = 1; i<=n+1; i++) {
            first = first.next;
        }
        while(first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        System.out.println(dummy.next.val);
    }
}
