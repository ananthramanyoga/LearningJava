package com.leetcode.programmingskills1;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {1,2,1,10};
        int[] nums1 = {2,1,2};
        System.out.println(largestPerimeter(nums));
        System.out.println(largestPerimeter(nums1));
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i>1; i--) {
            int s3 = nums[i];
            int s2 = nums[i-1];
            int s1 = nums[i-2];
            if(s3 < s1 + s2) {
                return s1 + s2 + s3;
            }
        }
        return 0;
    }
}
