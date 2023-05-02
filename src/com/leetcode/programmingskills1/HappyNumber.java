package com.leetcode.programmingskills1;

import java.util.Collection;
import java.util.HashSet;
public class HappyNumber {
    public static void main(String[]  args) {
        System.out.println("13 is a happy number: " + isHappy(13));
        System.out.println("1 is a happy number: " + isHappy(1));
        System.out.println("19 is a happy number: " + isHappy(19));
        System.out.println("2 is a happy number: " + isHappy(2));
    }
    public static boolean isHappy(int n) {
        return nonRecursiveCall(n, new HashSet<>());
    }
    public static boolean recursiveCall(int n, HashSet<Integer> nums) {
        int sum = 0;
        while(n > 0) {
            int temp = n%10;
            sum  += (temp * temp);
            n = n/10;
        }
        System.out.println(sum);
        if(sum == 1) {
            return true;
        } else if(nums.contains(sum)) {
            return false;
        }
        nums.add(sum);
        return recursiveCall(sum, nums);
    }
    public static boolean nonRecursiveCall(int n, HashSet<Integer> nums) {
        boolean flag= true;
        while (n > 1) {
            n = getDigit(n);
            System.out.println(n);
            if(nums.contains(n)) {
                return false;
            }
            nums.add(n);
        }
        return flag;
    }

    public static int getDigit(int n) {
        int sum = 0;
        while(n > 0) {
            int temp = n%10;
            sum  += (temp * temp);
            n = n/10;
        }
        return sum;
    }

}
