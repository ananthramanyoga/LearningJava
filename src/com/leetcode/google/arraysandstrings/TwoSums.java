package com.leetcode.google.arraysandstrings;

import com.leetcode.google.MyUtils;

import java.util.Hashtable;

public class TwoSums {
    public static void main(String args[]) {
        int[] input = MyUtils.populateIntArray();
        int target = MyUtils.readConsoleValue("Enter the target sum: ");
        //System.out.println("ans: " + twoSums(input, target));
        int[] ans = twoSumsSorted(input, target);
        System.out.println("ans: " + ans[0] + "," + ans[1]);
    }
    public static String twoSums(int[] input, int target) {
        Hashtable<Integer, Integer> hasT = new Hashtable<>();
        String ans = "";
        for(int i=0; i<input.length; i++) {
            int diff = target - input[i];
            if(hasT.containsKey(diff)) {
                ans = hasT.get(diff) + "," + i;
                return ans;
            } else {
                hasT.put(input[i], i);
            }
        }
        return "";
    }
    public static int[] twoSums1(int[] input, int target) {
        Hashtable<Integer, Integer> hasT = new Hashtable<>();
        int[] ans = new int[2];
        for(int i=0; i<input.length; i++) {
            int diff = target - input[i];
            if(hasT.containsKey(diff)) {
                ans[0] = hasT.get(diff);
                ans[1] = i;
                break;
            } else {
                hasT.put(input[i], i);
            }
        }
        return ans;
    }
    public static int[] twoSumsSorted(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int[] ans = new int[2];
        while(i < j) {
            int sum = nums[i] + nums[j];
            if(sum == target) {
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            } else {
                if(sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return ans;
    }
}
