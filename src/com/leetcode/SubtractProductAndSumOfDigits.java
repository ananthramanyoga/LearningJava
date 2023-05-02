package com.leetcode;

public class SubtractProductAndSumOfDigits {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }
    public static int subtractProductAndSum(int n) {
        int i = n;
        int product = 1;
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            product *= i % 10;
            i = i / 10;
        }

        return product - sum;
    }
}
