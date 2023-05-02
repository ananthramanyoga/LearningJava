package com.leetcode.google.arraysandstrings;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,9,9};
        int[] answer = plusOne(digits);
        for(int a: answer){
            System.out.println(a);
        }
    }

    public static int[] plusOne(int[] digits) {
        int[] answer = new int[digits.length];
        int carry = 0;
        int sumVal = 0;
        for(int i=digits.length-1; i>=0; i--) {
            if(i == digits.length-1) {
                sumVal = sum(digits[i] + 1, carry);
            } else {
                sumVal = sum(digits[i], carry);
            }
            if(sumVal > 9) {
                carry = 1;
                sumVal = 0;
            } else {
                carry = 0;
            }
            answer[i] = sumVal;
            if(i==0 && carry == 1) {
                int[] newAnswer = new int[digits.length + 1];
                newAnswer[0] = carry;
                for(int j = 1; j<=digits.length; j++) {
                    newAnswer[j] = answer[j-1];
                }
                return newAnswer;
            }
        }
        return answer;
    }
    public static int sum(int val, int carry) {
        int a = val + carry;
        return a;
    }
}
