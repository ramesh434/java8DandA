package com.learning.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumWithHashMap {

    public static void main(String[] args) {

        System.out.println("Hi");
        int[] input = {5,6,7,8};
        int  targetSum= 15;
        //int[] result=findTwoSumNumberUsingArray(input, targetSum);
        //int[] result=findTwoSumUsingHashmap(input, targetSum);
        int[] result=findTwoSumNumbersUsingBinarySearch(input, targetSum);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] findTwoSumUsingHashmap(int[] input, int targetSum) {
        Map<Integer, Integer> elements = new HashMap();

        for(int x=0 ; x< input.length ; x++) {

            if( elements.containsKey(targetSum-input[x])) {
                System.out.println( "\n twoSum solution elements  are  : " + input[x]+ " second element :" + input[x-1]);
                System.out.println( "\n twoSum solution elements indexes are  : " + (x-1 )+ " second element :" + (x));
                return new int[] {x, x-1} ;
            }else {
                elements.put(input[x] , x);
            }
        }
        return new int[] {-1, -1};
    }
    private static int[] findTwoSumNumberUsingArray(int[] input, int targetSum) {

        for(int x=0; x < input.length ; x++) {
            System.out.println("\n first loop iteration count is : " + x );
            for( int y= x+1; y < input.length ; y++) {
                System.out.println("\n Second loop iteration count is : " + y );
                if ((targetSum - input[x]) == input[y]) {
                    System.out.println( "\n twosum solution elements are  : " + input[x] + " second element :" + input[y] );
                    return new int[] {x, y};
                }
            }
        }
        return new int[] {-1, -1};
    }

    //input = {5,6,7,8}
    //targetValue=15
    //startIndex=0
    private static int[] findTwoSumNumbersUsingBinarySearch(int[] input, int targetSum) {

        for(int x=0; x< input.length ;x++) {
            int targetValue = targetSum - input[x]; // 15-5=10

            int result=binarySearch(input, 0,targetValue);
            //System.out.println( "\n twoSum solution elements  are  : " + input[x]+ " second element :" + input[result]);
            if(result != -1) {
                System.out.println( "\n twoSum solution elements  are  : " + input[x]+ " second element :" + input[result]);
                System.out.println( "\n twoSum solution elements indexes are  : " + x + " second element :" + result);
                return new int[] {x, result};
            }
        }
        return new int[]{-1, -1};
    }


    private static int binarySearch(int[] input, int startIndex, int targetValue)  {

        int length = input.length-1;
        System.out.println( "\n invoking binary search for  : " + targetValue); //
       while(startIndex < length) {
           int midIndex = (startIndex + length) /2;
           if(input[midIndex] < targetValue) {
               startIndex = midIndex+1;
           }else {
               length =midIndex;
           }

       }
       return (startIndex == length && input[startIndex] ==targetValue? startIndex:-1);
    }
}
