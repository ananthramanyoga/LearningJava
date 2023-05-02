package com.leetcode.google;

import java.util.Scanner;

public class MyUtils {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] populateIntArray() {
        int size = readConsoleValue("Enter the size of the array: ");
        int[] input = new int[size];
        for(int i =0; i< size; i++) {
            input[i] = readConsoleValue("Enter the value: ");
        }
        return input;
    }

    public static int readConsoleValue(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }
}
