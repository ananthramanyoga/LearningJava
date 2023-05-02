package com.leetcode.binarysearch.template1;

public class GuessNumber {
    public static int pick = 6;
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Picked Number between 1 to " +  n + " is " + guessNumber(n));
    }
    public static int guessNumber(int x) {
        int left = 1;
        while (left <= x) {
            int myPick = left + (x - left)/2;
            int myGuess = guess(myPick);
            if(myGuess == 0)  {
                return myPick;
            } else if(myGuess == -1) {
                x = myPick -1;
            } else if(myGuess == 1) {
                left = myPick + 1;
            }
        }
        return -1;
    }

    public static int guess(int num) {
        if(num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        }
        return 0;
    }
}
