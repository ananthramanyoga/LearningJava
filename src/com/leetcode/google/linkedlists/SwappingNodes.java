package com.leetcode.google.linkedlists;

import java.util.Scanner;

public class SwappingNodes {
    public static void main(String[] args) {
        AddTwoNumbers addT = new AddTwoNumbers();
        AddTwoNumbers.populateList(addT.l1);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the swap index: ");
        int k = s.nextInt();
        AddTwoNumbers.printList(addT.l1);
        System.out.println("-----After Swap-----");
        //AddTwoNumbers.printList(swapValues2Pass(addT.l1,k));
        AddTwoNumbers.printList(swapNode1Pass(addT.l1,k));
    }

    public static ListNode swapNode1Pass(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode secPreSwap = dummyHead;
        ListNode firPreSSwap = dummyHead;
        ListNode firstSwap = dummyHead;
        ListNode secSwap = dummyHead;
        ListNode last = head;
        for(int i = 1; i<k; i++) {
            last = last.next;
            secPreSwap = secPreSwap.next;
        }
        secSwap = secPreSwap.next;
        while(last.next != null) {
            last = last.next;
            firPreSSwap = firPreSSwap.next;
        }
        firstSwap = firPreSSwap.next;
        //Actual Swapping
        secPreSwap.next = firstSwap;
        firPreSSwap.next = secSwap;
        //Assigning the swapping node's next to the temp.
        last = secSwap.next;
        secSwap.next = firstSwap.next;
        firstSwap.next = last;
        return dummyHead.next;
    }

    public static ListNode swapValues2Pass(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int last = size - k + 1;
        ListNode firstNode = head;
        ListNode secondNode = head;
        for(int i = 1; i <= last; i++) {
            if(i<k){
                firstNode = firstNode.next;
            }
            if(i<last) {
                secondNode = secondNode.next;
            }
        }
        int val = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = val;
        return head;
    }
}
