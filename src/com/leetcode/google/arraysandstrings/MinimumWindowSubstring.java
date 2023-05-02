package com.leetcode.google.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String s1 = "a";
        String t1 = "a";
        String s2 = "q";
        String t2 = "qq";
        System.out.println(minWindow(s,t));

    }
    public static String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        Map<Character,Integer> dictMap = new HashMap<>();
        for(int i =0; i<t.length(); i++) {
            dictMap.put(t.charAt(i), dictMap.getOrDefault(t.charAt(i),0)+1);
        }
        int required = dictMap.size();
        int formed = 0;
        Map<Character,Integer> charMap = new HashMap<>();

        while(right < s.length()) {
            char c = s.charAt(right);
            int count = charMap.getOrDefault(s.charAt(right),0);
            charMap.put(c,count + 1);

            if(dictMap.containsKey(c) && charMap.get(c).intValue() == dictMap.get(c).intValue()) {
                formed++;
            }

        }
        return "";
    }
}
