package com.leetcode.google.interviewprocess;
/*
You are given a license key represented as a string s that consists of only alphanumeric characters and dashes.
The string is separated into n + 1 groups by n dashes. You are also given an integer k.

We want to reformat the string s such that each group contains exactly k characters, except for the first group,
which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash
inserted between two groups, and you should convert all lowercase letters to uppercase.

Return the reformatted license key.

Example 1:

Input: s = "5F3Z-2e-9-w", k = 4
Output: "5F3Z-2E9W"
Explanation: The string s has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
Example 2:

Input: s = "2-5g-3-J", k = 2
Output: "2-5G-3J"
Explanation: The string s has been split into three parts, each part has 2 characters except the first part as
it could be shorter as mentioned above.

 */


import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class LicenceKeyFormatting {
    public static void main(String[] args) {
        //String s = "5F3Z-2e-9-w";
        //int k = 4;
        //String s = "2-5g-3-J";
        //int k = 2;
        //String s = "2-4A0r7-4k";
        //int k = 3;
        //String s = "--------EyRfCyHxyUJzhygiazYpjuDFdHvrnDwoQKQEsccLDiwhpmjueADIzqIvExbDDFnEGovAxYeszbzuTekRuWUPXRPbVKJuDQzIzzTj";
        //int k = 16;
        String s = "---";
        int k = 3;
        System.out.println(licenseKeyFormatting(s,k));
    }
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder ab = new StringBuilder();
        String st =  "";
        if (s.matches("^[a-zA-Z0-9\\-]+") && (s.length() >= 1 && s.length() <= (Math.pow(10,5))) && (k >= 1 && k <= (Math.pow(10,4)))) {
            s = s.replaceAll("\\-", "");
            int r = s.length() % k;
            if (r > 0) {
                while (k-r > 0) {
                    s = "$" + s;
                    r++;
                }
            }
            int endIndex = k;
            int startIndex=0;
            for(int i = 0; i < s.length(); i++) {
                if((i+1)%k == 0) {
                    ab.append(s.substring(startIndex,endIndex));
                    endIndex += k;
                    startIndex+=k;
                        ab.append("-");
                }
            }
            st = ab.toString().replaceAll("\\$","");
            System.out.println(st);
            if(!st.isEmpty() && st.charAt(st.length()-1) == '-') {
                st = st.substring(0,st.length()-1);
            }
        }
        return st.toUpperCase();
    }
}
