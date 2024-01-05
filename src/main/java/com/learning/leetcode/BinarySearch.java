package com.learning.leetcode;

public class BinarySearch {

    public static void main(String[] args) {

        System.out.println("Hi");
        int[] input={2,4};//,4, 8, 10, 15};
        //int[] input= new int[5];
        int element =2;
        int startIndex=0;
        System.out.println( "\n element found  @index : " + searchElementInArray(input,startIndex, element));
    }

    //inout={2, 4, 8, 10, 15} , element = 2
    private static int searchElementInArray(int[] input, int startIndex, int element){

        int length = input.length;
        while (startIndex < length){ //startIndexIndex = 0 , 1 length = 4
            int midIndex= (startIndex + length-1) / 2; //midIndex= (0 +4)/2 =2, (2+4)/2=3
            System.out.println( " \n startIndex is : " + startIndex);
            System.out.println( " \n Array length is : " + length);
            System.out.println( " \n midIndex is : " + midIndex);
            if (input[midIndex] < element) { // 8< 10 , 10< 10
                startIndex = midIndex;
            }else {
                if(input[midIndex] == element) { // 2 == 2
                    System.out.println( " \n element :  "+ element + " @Index  is :  " + midIndex);
                    return midIndex;
                }else{
                    if(input[midIndex] > element) // 8 > 2
                        startIndex = startIndex + 1;
                        length= midIndex;

                }
            }
        }
        return (input[startIndex] == element)  ? 0 : -1;
    }
}
