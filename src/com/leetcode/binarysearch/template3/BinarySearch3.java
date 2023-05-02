package com.leetcode.binarysearch.template3;

public class BinarySearch3 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println("Target " + target + " found at position " + search(nums, target));
    }
    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while(left + 1 <  right) {
            int pivot = left + (right - left) / 2;
            if(nums[pivot] == target) {
                return pivot;
            } else {
                if(nums[pivot] < target) {
                    left = pivot;
                } else {
                    right = pivot;
                }
            }
        }
        if(nums[left] == target) {
            return left;
        }
        if(nums[right] == target) {
            return right;
        }
        return -1;
    }
}
