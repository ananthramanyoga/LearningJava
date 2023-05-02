package com.leetcode.google.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithTwoDistinct {
    public static void main(String[] args) {
        String s = "eceba";
        String s1 = "ccaabbb";
        System.out.println(lengthOfLongestSubStringTwoDistinct(s));
    }
    public static int lengthOfLongestSubStringTwoDistinct(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int ans = 0;
        int left = 0;
        int right = 0;
        while(right<s.length()) {
            charMap.put(s.charAt(right),charMap.getOrDefault(s.charAt(right),0) + 1);
                while(charMap.size() > 2) {
                    charMap.put(s.charAt(left), charMap.getOrDefault(s.charAt(left),0) - 1);
                    if(charMap.get(s.charAt(left)) == 0) {
                        charMap.remove(s.charAt(left));
                    }
                    left++;
                }
                ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
