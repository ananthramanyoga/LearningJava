package com.leetcode.binarysearch.template3;

public class FirstAndLastInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] out1 = searchRange(nums, target);
        System.out.println("Search Range for target 8 in nums: [" + out1[0] + ", " + out1[1] + "]");
        target = 6;
        out1 = searchRange(nums, target);
        System.out.println("Search Range for target 6 in nums: [" + out1[0] + ", " + out1[1] + "]");
        int[] nums1 = {};
        out1 = searchRange(nums1, target);
        System.out.println("Search Range for target 6 in nums1: [" + out1[0] + ", " + out1[1] + "]");
        int[] nums2 = {6};
        out1 = searchRange(nums2, target);
        System.out.println("Search Range for target 6 in nums1: [" + out1[0] + ", " + out1[1] + "]");

    }
    public static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findPosition(nums, target, true);

        if(firstOccurrence == -1) {
            return new int[]{-1,-1};
        }

        int lastOccurrence = findPosition(nums, target, false);

        return new int[]{firstOccurrence, lastOccurrence};
    }

    public static int findPosition(int[] nums, int target, boolean isFirst) {
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                if(isFirst) {
                    if(mid == start || nums[mid - 1] != target) {
                        return mid;
                    }
                    end = mid - 1;
                } else {
                    if(mid == end || nums[mid + 1] != target) {
                        return mid;
                    }
                    start = mid + 1;
                }
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
