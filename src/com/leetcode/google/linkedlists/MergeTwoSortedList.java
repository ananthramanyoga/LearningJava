package com.leetcode.google.linkedlists;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        AddTwoNumbers addT = new AddTwoNumbers();
        AddTwoNumbers.populateList(addT.l1);
        AddTwoNumbers.populateList(addT.l2);
        AddTwoNumbers.printList(addT.l1);
        AddTwoNumbers.printList(addT.l2);
        ListNode sum = mergeTwoListsRec(addT.l1, addT.l2);
        AddTwoNumbers.printList(sum);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 == null) ? l2 : l1;
        return head.next;
    }

    public static ListNode mergeTwoListsRec(ListNode l1, ListNode l2) {
        if(l1 == null)  {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode head = new ListNode();
        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
        head.next = mergeTwoListsRec(l1,l2);
        return head;
    }
}
