package com.leetcode.google.interviewprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
You are visiting a farm that has a single row of fruit trees arranged from left to right.
The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of
fruit each basket can hold.

Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree)
while moving to the right. The picked fruits must fit in one of your baskets.

Once you reach a tree with fruit that cannot fit in your baskets, you must stop.

Given the integer array fruits, return the maximum number of fruits you can pick.
 */
public class FruitBasket {
    public static void main (String[] args) {
        //int[] fruits = {1,2,1};
        //int[] fruits = {0,1,2,2};
        //int[] fruits = {1,2,3,2,2};
        //int[] fruits = {1,2,3,3,2,1,3,2,1,3,1};
        int[] fruits = {1,2,1,3,3,2,2,1,3};
        //System.out.println("Output:  " + totalFruit((fruits)));
        System.out.println("Output:  " + alternateMethod((fruits)));

    }
    public static int totalFruit(int[] tree) {
        int total = 0;
        int runningTotal =0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0, j = 0; i < tree.length; i++) {
            // increment key's frequency by 1
            map.put(tree[i], map.getOrDefault(tree[i], 0) + 1);
            while(map.size()>2) {
                map.put(tree[j], map.get(tree[j]) - 1);
                runningTotal--;
                if(map.get(tree[j])==0) {
                    map.remove(tree[j]);
                }
                j++;
            }
            runningTotal++;
            total = Math.max(total, runningTotal);
        }
        return total;
    }

    public static int alternateMethod(int[] tree){
        //int[] fruits = {1,2,1,3,3,2,2,1,3};
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap();
        int p1 = 0;
        int p2 = 0;

        while (p2 < tree.length) {
            if (map.size() <= 2) {
                map.put(tree[p2], map.getOrDefault(tree[p2], 0) + 1);
                if (map.size() < 3) {
                    max = Math.max(max, 1 + (p2 - p1));
                }
                p2++;
            } else {
                map.put(tree[p1], map.get(tree[p1]) - 1);
                if (map.get(tree[p1]) == 0) {
                    map.remove(tree[p1]);
                }
                p1++;
            }

        }

        return max;
    }
}
