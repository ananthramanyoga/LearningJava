package com.leetcode.google.arraysandstrings;

public class FindAndReplaceInString {
    public static void main(String[] args) {
//        String s = "abcd";
//        int[] indices = {0,2};
//        String[] sources = {"a","cd"};
//        String[] targets = {"eee","ffff"};
        String s = "vmokgggqzp";
        int[] indices = {3,5,1};
        String[] sources ={"kg","ggq","mo"};
        String[] targets = {"s","so","bfr"};
        System.out.println(findReplaceString(s,indices,sources,targets));
    }
    public static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        String result = "";
        boolean matched = false;
        if(s.length() >= 1 && s.length() <= 1000 && (indices.length == sources.length && sources.length ==
                targets.length)) {
            for(int i = indices.length-1; i>=0; i--) {
                if((indices[i] >= 0 && indices[i]<s.length()) && sources[i].length() >=1 && targets[i].length() <= 50) {
                   String temp = s.substring(indices[i],indices[i]+sources[i].length());
                   if(temp.equalsIgnoreCase(sources[i])) {
                       s = s.substring(0, indices[i]) + targets[i] + s.substring(indices[i] + sources[i].length());
                   }
                }
            }
        }
        return s;
    }
}
