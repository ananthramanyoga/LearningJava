package com.leetcode.google.arraysandstrings;

public class ContainerWithMostWater {
    public static void main(String args[]) {
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int area = 0;
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i != j) {
            int diff = j-i;
            if(height[i] <= height[j]) {
                area = height[i] * diff;
                i++;
            } else {
                area = height[j] * diff;
                j--;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}
