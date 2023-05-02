package com.leetcode.binarysearch.template2;

public class FirstPeakElement {
    public static void main(String[] args) {
        int[] n = {6,5,4,3,1,2,3,1};
        System.out.println("The peak element is " + firstBadVersion(n));
    }
    public static int firstBadVersion(int[] nums) {
        int left = 0, right = nums.length-1;
        if(nums.length == 1) {
            return 0;
        }
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid +1;
            }
        }
        return left;
    }
}
