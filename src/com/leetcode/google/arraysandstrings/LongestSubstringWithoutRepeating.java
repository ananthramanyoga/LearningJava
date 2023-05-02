package com.leetcode.google.arraysandstrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkews";
        System.out.println(lengthOfLongestSubStringSet(s2));
    }
    public static int lengthOfLongestSubString(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int ans = 0;
        for(int i=0,j=0; i<s.length(); i++) {
            if(charMap.containsKey(s.charAt(i))) {
                j = Math.max(charMap.get(s.charAt(i)),j);
            }
            charMap.put(s.charAt(i),i+1);
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
    public static int lengthOfLongestSubStringSet(String s) {
        Map<Character, Integer> chars = new HashMap();

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars.put(r, chars.getOrDefault(r,0) + 1);

            while (chars.get(r) > 1) {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}
