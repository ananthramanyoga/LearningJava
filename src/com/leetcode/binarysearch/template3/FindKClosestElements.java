package com.leetcode.binarysearch.template3;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public static void main(String[] args) {

    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;
        while(left < right) {
            int mid = (right + left)/2;
            if(Math.abs(x - arr[mid]) >  Math.abs(arr[mid+1]-x)) {
                
            }
        }
        return new ArrayList<>();
    }
}
