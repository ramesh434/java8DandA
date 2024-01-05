package com.learning.streams;

import java.util.ArrayList;

public class StreamsEx {

    public static void main(String[] args) {
        System.out.println("\n Streams exzmple \n");
        var lst = new ArrayList<String>();
        lst.add("Ramesh");
        lst.add("kalluri");

        var cnt=lst.stream().map(x -> x.concat("append"));
        //cnt.forEach(System.out::println);
        cnt.peek(element -> System.out.println(element));
        cnt.distinct();


    }
}
