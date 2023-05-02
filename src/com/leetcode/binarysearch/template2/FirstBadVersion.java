package com.leetcode.binarysearch.template2;

public class FirstBadVersion {
    public static int badVersion = 1;
    public static void main(String[] args) {
        int n = 1;
        System.out.println("The First bad version between 1 to " + n + " is " + firstBadVersion(n));
    }
    public static int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
    public static boolean isBadVersion(int n) {
        if(n == badVersion) {
            return true;
        }
        return false;
    }
}
