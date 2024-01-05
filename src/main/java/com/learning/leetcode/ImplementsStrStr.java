package com.learning.leetcode;


/*
Implement strstr().
  1. Returns the index of the first occurrence of needle in haystack,
  2. Return  –1 if needle is not part of haystack.

 */
public class ImplementsStrStr {

    public static void main(String[] args) {
        System.out.println("HI");
        ImplementsStrStr obj = new ImplementsStrStr();
        String haystack = "mississipissi";
        String needle= "issi";
        int result =obj.strStr(haystack, needle);
        if(result ==-1)
            System.out.println(" \n word : " + needle +" not found  @ index of : " + result);
        if(result >0)
            System.out.println(" \n word : " + needle +"  found  @ index of : " + result);
        if(result ==0)
            System.out.println(" \n word " + needle +"  is empty " );
    }

    // haystack =
    // needle = abc
    private int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length() || haystack.length() ==0)
            return -1;
        if(haystack.length() ==0) return 0;
        var repeatCount=0;
        for( int i=0 ; ; i++) { //i=0 //i=1
            for( int j=0; ; j++) { //j=0 //j==1
                if(j==needle.length()) {
                    return 0;
                }
                if(i+j ==haystack.length() ) {
                    if (repeatCount !=0)
                        return i;
                    else
                        return -1;
                }
                if(!Character.isLetterOrDigit(haystack.charAt(i+j))) i++;

                if(Character.toLowerCase(needle.charAt(j)) != Character.toLowerCase(haystack.charAt(i+j)))  break; //a ==a //b ==a



            }
        }

    }
}
