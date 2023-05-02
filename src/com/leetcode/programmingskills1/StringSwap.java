package com.leetcode.programmingskills1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSwap {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        System.out.println(areAlmostEqual("attack", "defend"));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        List<Character> chars1 = new ArrayList<>();
        List<Character> chars2 = new ArrayList<>();
        List<Character> chars3 = new ArrayList<>();
        for(int i=0; i<s1.length(); i++) {
            chars1.add(s1.charAt(i));
            chars2.add(s2.charAt(i));
            chars3.add(s2.charAt(i));
        }
        chars1.sort(Character::compareTo);
        chars3.sort(Character::compareTo);
        if(chars1.toString().equals(chars3.toString())) {

        }
        return false;
    }
}
