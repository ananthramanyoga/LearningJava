package com.learning;

public class Factorial {
    //static int a = 0;

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Using recursion: Fact of " + number + " is : " + factRecursion(number));
        //System.out.println("Using loop: Fact of " + number + " is : " + factLoop(number));
        testAdd(number);
        //testAdd(a);

    }
    public static int factRecursion(int n) {
        if(n ==0 || n==1) {
            return 1;
        }
        n = n * factRecursion(n-1);
        return n;

    }
    public static int testAdd(int n) {
        int a = 0;
        a = n + a;
        System.out.println(a);
        return 0;
    }
}
