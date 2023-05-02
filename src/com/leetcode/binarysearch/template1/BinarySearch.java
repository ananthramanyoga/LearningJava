package com.leetcode.binarysearch.template1;

import sun.lwawt.macosx.CSystemTray;

public class BinarySearch {
    public static int pick = 6;
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println("Target " + target + " found at position " + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int mid, left = 0, right = nums.length - 1;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid -1;
            }
        }
        return -1;
    }
}
