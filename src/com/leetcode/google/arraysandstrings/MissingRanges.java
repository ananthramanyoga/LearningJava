package com.leetcode.google.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

    public static void main(String[] args) {
        int[] nums = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;
//        int[] nums = {};
//        int lower = -2;
//        int upper = 0;
        List<String> ansList = findMissingRanges(nums, lower, upper);
        System.out.println(ansList.toString());
    }
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ansList =  new ArrayList<>();
        int prev = lower - 1;
        for(int i = 0; i <= nums.length; i++) {
            if(i>0) {
                prev = nums[i-1];
            }
            int curr = (i<nums.length) ? nums[i] : upper + 1;
            if(prev + 1 < curr -1) {
                ansList.add((prev + 1) + "->" + (curr - 1));
            } else if (prev + 1 == curr - 1) {
                ansList.add(Integer.toString(prev+1));
            }

        }
        return ansList;
    }
}
