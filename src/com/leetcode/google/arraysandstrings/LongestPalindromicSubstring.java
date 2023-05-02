package com.leetcode.google.arraysandstrings;

import com.sun.tools.javac.util.List;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Queue;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String s1 = "cbbd";
        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome(s1));
    }
    public static String longestPalindrome(String str) {
        String longestPalindrome = "";
        ArrayDeque<Character> temp = new ArrayDeque<>();
        ArrayDeque<Character> tempRev = new ArrayDeque<>();
        int k = 0;
        for(int i=0; i<str.length(); i++) {
            temp.removeAll(temp);
            tempRev.removeAll(tempRev);
            for(int j=i; j<str.length(); j++) {
                temp.add(str.charAt(j));
                tempRev.addFirst(str.charAt(j));
                if(temp.toString().equals(tempRev.toString())) {
                    if(longestPalindrome == null || longestPalindrome.length() <= temp.size()) {
                        longestPalindrome = temp.toString();
                    }
                }
            }
        }

        return longestPalindrome;
    }
}
