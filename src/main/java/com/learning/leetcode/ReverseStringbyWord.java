package com.learning.leetcode;

/*
Given an input string s, reverse the string word by word.
 */
public class ReverseStringbyWord {

    public static void main(String[] args) {
    var input= "Daily programming practice will build \n confidence";

        ReverseStringbyWord obj = new ReverseStringbyWord();
        System.out.println("\n Final reverse string is : " + obj.reverseString(input));
    }

    /*
     input = "Daily programming practice will build confidence"
     reverse = "confidence build will practice programming daily"
     Rules/Conditions:
     1. Space will constitute the word
     2. there are not trail & leading spaces in input string.
     3. there are no tabs & end of line char in input string
     4. if more than one space available then keep only one space in reverse string
     */
    // input ="Daily programming" //17
    // lgth= 17
    //
    private String reverseString(String input) {
        System.out.println("\n Given input string is: " + input);
        StringBuffer reversed = new StringBuffer();
        int lgth = input.length()-1;
        int mvpointer=input.length() ;
        for(int i=lgth; i>=0; i--){
            if(input.charAt(i) == ' '){
                mvpointer = i;
                System.out.println("\n moving pointer  index is : " + mvpointer);
            }else {
                if(i==0 || input.charAt(i-1) == ' ') {
                    if(reversed.length() !=0) {
                        reversed.append(" ");
                    }
                    System.out.println("\n input string index is : " + i);
                    reversed.append(input.substring(i, mvpointer));
                    System.out.println("\n reverse string is : " + reversed);
                }

            }
        }
        return reversed.toString();
    }
}
