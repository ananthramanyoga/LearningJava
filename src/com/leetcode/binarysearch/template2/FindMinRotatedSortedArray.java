package com.leetcode.binarysearch.template2;

public class FindMinRotatedSortedArray {
    public static void main(String[] args) {
        int[] n = {9,10,11,1,2,3,4,5,6,7,8};
        System.out.println("The min element is " + findMin(n));
    }
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        if(nums.length == 1 || nums[right] > nums[left]) {
            return nums[0];
        }
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if(nums[mid-1] > nums[mid]) {
                return nums[mid];
            }
            if(nums[mid] > nums[0]) {
                left = mid +1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
