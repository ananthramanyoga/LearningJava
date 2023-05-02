package com.leetcode.binarysearch.template1;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Square root of " + n + " is " + sqrt(n));
    }
    //Find the square root using binary search approach
    public static int sqrt(int x) {
        if(x < 2) {
            return x;
        }
        int pivot, left = 2,right = x/2;
        while(left<=right) {
            pivot = left + (right - left)/2;
            long nums = (long) pivot * pivot;
            if(nums > x) {
                right = pivot - 1;
            } else if (nums < x) {
                left = pivot + 1;
            } else {
                return pivot;
            }
        }
        return right;
    }
}
