package com.leetcode.binarysearch.template1;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums =  {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Target " + target + " is found at position " + search(nums, target));
        target = 3;
        System.out.println("Target " + target + " is found at position " + search(nums, target));
        nums = new int[]{1};
        target = 0;
        System.out.println("Target " + target + " is found at position " + search(nums, target));

    }

    public static int search(int[] nums, int target) {

        if(nums.length  == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int rotationIndex = findRotationIndex(nums);
        if(nums[rotationIndex] == target) {
            return rotationIndex;
        }
        if(rotationIndex == 0) {
            return search1(0, nums.length-1, nums, target);
        }
        if(target < nums[0]) {
            return search1(rotationIndex, nums.length-1, nums, target);
        }
        return search1(0, rotationIndex, nums, target);
    }

    public static int search1(int left, int right, int[] nums, int target) {
        while(left <= right) {
            int pivot = (left + right)/2;
            if(nums[pivot] == target) {
                return pivot;
            } else {
                if(target <  nums[pivot]) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }
        return -1;
    }

    public static int findRotationIndex(int[] nums) {
        int left = 0, right = nums.length - 1;
        if(nums[left] < nums[right]) {
            return 0;
        }
        while(left <= right) {
            int pivot = (left + right)/2;
            if(nums[pivot] > nums[pivot + 1]) {
                return pivot + 1;
            } else {
                if(nums[pivot] < nums[left]) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }
        return 0;
    }

}
