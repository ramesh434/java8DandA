package com.learning.leetcode;

/*
  Reverse Words in a String  with the following constraints.

  1. The input string does not contain leading or trailing spaces and the words are always
    separated by a single space.
  2. Could you do it in-place without allocating extra space?

  Challenge 1:
    Implement the two-pass solution without using the library’s split function.
  Challenge 2:
    Rotate an array to the right by k steps in-place without allocating extra space. For
    instance, with k = 3, the array [0, 1, 2, 3, 4, 5, 6] is rotated to [4, 5, 6, 0, 1, 2, 3].

 */
public class ReverseStringInline {

    public static void main (String[] args) {

        var input= "abcdf hijklmn".toCharArray();
                //new char[]{'a','b','c','d'};
        System.out.println("\n Raw input  length is : " + input.length);
        for(char x : input) System.out.print(x);
        var obj= new ReverseStringInline();
        obj.reverseWordInline(input,0, input.length);

        System.out.println("\n First inlineReserveWord is  : " + input);
        for(char x : input) System.out.print(x);
        for(int i=0,j=0; j<=input.length ;j++) {
            System.out.println(" before if condition indexes are   i: " + i +" J :" +j);
             if( j== input.length || input[j] == ' ') {                 System.out.print(" indexes are   i: " + i +" J :" +j);
                 obj.reverseWordInline(input, i, j);
                 i=j+1;
             }
        }
        System.out.println("\n Second inlineReserveWord is  : " + input);
        for(char x : input) System.out.print(x);
    }


    /*
    input : {a,b,c,d}
    output : {d,c,b,a}

     */
    private void reverseWordInline(char[] input , int startIndex, int endIndex) {
        int mid = (endIndex -startIndex) /2; //4-0/2 =2
        for(int i=0; i < mid ; i++) { //0 < 2
            var temp = input[startIndex+i]; // a
            input[startIndex +i] = input[endIndex-i-1];
            input[endIndex-i-1] = temp;
        }

    }
}
