package com.learning.leetcode;

public class ValidPalindrome {

    public static  void main(String[] args) {


        String input = "BBBBB BBB";

        //System.out.println(strArray.getClass());
    }

    /*
    considering only alphanumeric characters
    and ignoring cases
             0 123     012
    input = "A car" or RAR  aaaaa
     */
    private  Boolean isValidPalindrome( String input) {
       int startIndex=0; //0 //1
       int rearIndex = input.length() -1; //2 //1
       while( startIndex < rearIndex) { // 0 < 2 //true

           while((startIndex < rearIndex )&& !Character.isLetterOrDigit(input.charAt(startIndex))){
               startIndex ++;
           }
           while((startIndex < rearIndex )&& !Character.isLetterOrDigit(input.charAt(rearIndex))){
               rearIndex ++;
           }
           if(Character.toLowerCase(input.charAt(startIndex)) != Character.toLowerCase(input.charAt(rearIndex)) ) {
               return false;
           }
           startIndex++; //1
           rearIndex--; //1
       }

        return true;
    }
}
