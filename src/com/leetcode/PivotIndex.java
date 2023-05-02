package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class PivotIndex {
    public static void main(String[] args) {
        int[] a = {1,7,3,6,5,6};
        int s = pivotIndex(a);
        System.out.println(s);
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }

    public static int getLengthOfOptimalCompression(String s, int k) {
        if((s.length() <= 1 || s.length() >= 100) && (k <=0 || k >= s.length())) {
            System.out.println("Invalid Input");
            return 0;
        }
        StringBuilder str = new StringBuilder();
        int counter = 0;
        char curr = ' ';
        for (int i = 0; i < s.length(); i++) {
            curr = s.charAt(i);
            if (i == 0) {
                str.append(curr);
                counter++;
            } else {
                char prev = s.charAt(i - 1);
                if (curr != prev) {
                    if (counter > 1) {
                        str.append(counter);
                    }
                    str.append(curr);
                    counter = 1;
                } else {
                    counter++;
                }
            }
        }
        if(counter > 1) {
            str.append(counter);
        }
        System.out.println(str.toString());
        return str.toString().length();
    }
    }
