package com.learning.leetcode;

import java.util.HashMap;
import java.util.Map;

/*

Design and implement a TwoSum class. It should support the following operations: add
and find.
add(input) – Add the number input to an internal data structure.
find(value) – Find if there exists any pair of numbers which sum is equal to the value.
For example,
add(1); add(3); add(5); find(4)  true; find(7)  false

 */


public class TwoSum {

    Map<Integer, Integer> ds= new  HashMap();

    public static void main(String rags[]) {

        System.out.println("Hi");
        TwoSum sum = new TwoSum();
        sum.add(1);
        sum.add(3);
        sum.add(5);
        sum.add(3);
        System.out.println(sum.find(2));
        System.out.println(sum.find(7));
        //System.out.println(sum.findTwoSumNumByTargetNum(input1 , target));


    }

    /*
    add(input) – Add the number input to an internal data structure.
    For example: add(1); add(3); add(5);
     */
    private  void add(int input) {

      int count= ds.containsKey(input)?ds.get(input):0;
      ds.put(input, count+1);

    }

    /*
    find(value) – Find if there exists any pair of numbers which sum is equal to the value.
    find(4)  true; find(7)  false
     */
    private boolean find(int targetValue) {
        System.out.println( "\n twoSum value is :" + targetValue);
        for(Map.Entry<Integer,Integer> entry:    ds.entrySet()){
            int num= entry.getKey();
            System.out.println( "\n Entry key in  Map :" + num);
            int lookupValue= targetValue -num;
            System.out.println( "\n Lookup key in  Map :" + lookupValue);
            if(lookupValue == num) {
                if(entry.hashCode() >=2) {
                    System.out.println("\n duplication check applied for input : " + targetValue );
                    return true;
                }
            }
            else{
                if(ds.containsKey(lookupValue))
                    return true;
            }
        }
        return false;
    }

}
