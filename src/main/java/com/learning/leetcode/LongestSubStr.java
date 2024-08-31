package com.learning.leetcode;

/*
Given a string, find the length of the longest substring without repeating characters. For
example, the longest substring without repeating letters for “abcabcbb” is “abc”, which
 */

public class LongestSubStr {
    public static void main(String[] args) {
    var obj = new LongestSubStr();
    var input= "abcabcbb";
    obj.getLongestSubStr(input);

    }

    /*
     input : “abcabcbb”
     output: abc
     */
    private int getLongestSubStr(String input) {
        boolean exist[] = new boolean[150];
        exist['a']  = true;
        exist['b']  = true;
        exist['c']  = true;
        for (var ele : exist) System.out.println("\n outputs are : " + ele);

        int i=0;
        int maxLength=0;
        for(int j=0 ; j< input.length();j++) {
            System.out.println(input.charAt(j));
           while(exist[input.charAt(j)]){ // a
                i++;
           }
            exist[input.charAt(j)] =true;
            maxLength = Math.max(j-i+1, maxLength);
        }

        return maxLength;
    }



}
