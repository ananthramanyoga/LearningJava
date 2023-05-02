package com.leetcode.google.arraysandstrings;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {3};
        int[] nums2 = {};
        System.out.println("Median is: " + findMedianSortedArrays(nums1, nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[nums1.length+nums2.length];
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length) {
            mergedArray[k] = nums1[i];
            k++;
            i++;
        }
        while(j < nums2.length) {
            mergedArray[k] = nums2[j];
            k++;
            j++;
        }
        boolean even = false;
        if((nums1.length + nums2.length)%2 == 0) {
            even = true;
        }
        for(int a : mergedArray) {
            System.out.print(a + " -> ");
        }
        return getMedian(even, mergedArray);
    }

    public static double getMedian(boolean even, int[] mergedArray) {
        double median = 0;
        int index = mergedArray.length/2;
        if(even) {
            median = (mergedArray[index-1] + mergedArray[index])/2.0;
        } else {
            median = mergedArray[index];
        }
        return median;
    }

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        double median = 0;
        boolean even = false;
        int length = nums1.length + nums2.length;
        int medianIndex = length / 2;
        if(length % 2 == 0){
            even = true;
        }
        int j = 0;
        int k = 0;
        int prevVal = 0;
        int currentVal = 0;
        for(int i = 0; i <= medianIndex; i++) {
            prevVal = currentVal;
            int cval1 = 0;
            int cval2 = 0;
            if(j < medianIndex) {
                cval1 = nums1[j];
            } else {
                cval1 = currentVal;
            }
            if (k < medianIndex) {
                cval2 = nums2[k];
            } else {
                cval2 = currentVal;
            }
            if(cval1 < cval2) {
                currentVal = cval1;
                j++;
            } else {
                currentVal = cval2;
                k++;
            }
        }
        if(even) {
            median = (prevVal + currentVal) / 2.0;
        } else {
            median = currentVal;
        }
        return median;
    }

}
