package com.leetcode.google.linkedlists;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CloneLinkedList {
    RandomListNode l1 = new RandomListNode();
    public static Map<RandomListNode, RandomListNode> visitedMap = new HashMap<>();

    public static void main(String[] args) {
//        AddTwoNumbers addT = new AddTwoNumbers();
//        AddTwoNumbers.populateList(addT.l1);
//        AddTwoNumbers.printList(addT.l1);
//        ListNode sum = copySingleList(addT);
//        AddTwoNumbers.printList(sum);

        CloneLinkedList cl = new CloneLinkedList();
        populateRandomList(cl.l1);
        printRandomList(cl.l1);
        RandomListNode cloned = copyRandomList(cl.l1);
        printRandomList(cloned);
    }

    public static RandomListNode getClonedNode(RandomListNode node) {
        RandomListNode cloned;
        if(node == null) {
            return null;
        }
        if(visitedMap.containsKey(node)) {
            cloned = visitedMap.get(node);
        } else {
            visitedMap.put(node, new RandomListNode(node.val));
            cloned = visitedMap.get(node);
        }
        return cloned;
    }

    public static RandomListNode copyRandomList(RandomListNode rl1) {
        if(rl1 == null) {
            return null;
        }
        RandomListNode dummy = rl1;
        RandomListNode newNode = new RandomListNode(dummy.val);
        visitedMap.put(rl1, newNode);
        while(dummy != null) {
            newNode.next = getClonedNode(dummy.next);
            newNode.random = getClonedNode(dummy.random);
            dummy = dummy.next;
            newNode = newNode.next;
        }
        return visitedMap.get(rl1);
    }


    public static RandomListNode copyRandomListClone(RandomListNode rl1) {

        return visitedMap.get(rl1);
    }

    public static void printRandomList(RandomListNode rl1) {
        while(rl1 != null) {
            String s = "null";
            if(rl1.random != null) {
                s = Integer.toString(rl1.random.val);
            }
            System.out.print (rl1.val + "(" + s + ") " + rl1.toString() + " -> ");
            rl1 = rl1.next;
        }
        System.out.println("");
    }

    public static void populateRandomList(RandomListNode rl1) {
        Map<String,RandomListNode> map1 = new HashMap<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of list: ");
        int l1Size = s.nextInt();
        String[] randLi = new String[l1Size];
        for (int i = 1; i <= l1Size; i++) {
            System.out.println("Enter the value: ");
            int val = s.nextInt();
            System.out.println("Enter the random pointer: ");
            String ranPoint = s.next();
            randLi[i-1] = ranPoint;
            if (i == 1) {
                rl1.val = val;
                map1.put(Integer.toString(i),rl1);
            } else {
                RandomListNode node = new RandomListNode(val);
                RandomListNode last = rl1;
                map1.put(Integer.toString(i),node);
                while (last.next != null) {
                    last = last.next;
                }
                last.next = node;
            }
        }

        int count = 0;
        RandomListNode temp = rl1;
        while(temp != null) {
            temp.random = map1.get(randLi[count]);
            count++;
            temp = temp.next;
        }

    }

    public static ListNode copySingleList(AddTwoNumbers addT) {
        ListNode head = addT.l1;
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode second = dummy;

        while (temp != null) {
            ListNode clone = new ListNode();
            clone.val = temp.val;
            temp = temp.next;
            second.next = clone;
            second = second.next;
        }
        return dummy.next;
    }
}
