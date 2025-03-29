package com.dsAlgo.Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {

   // Count the number of strings that start with alphabet "a"

        ArrayList<String> list = new ArrayList<>();
        list.add("Alekha");
        list.add("Aadya");
        list.add("Banana");
        list.add("Sheetal");
        list.add("Mari");

        int count = findNoOfStrings(list);
        System.out.println(count);

        // This example can be achieved via Streams

        streamFilter(list);

        streamMap(list);
        streamCollect(list);









    }

    private static void streamCollect(ArrayList<String> list) {

        // Take a list , perform some operations and CONVERT IT BACK INTO LIST
        List<String> ls = Stream.of("Abhijeet", "Don", "Alekhya", "Aanya").filter(s-> s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());


        // print unique number from the array

        List<Integer> values = Arrays.asList(3,2,5,6,4,2,3,1);
        values.stream().distinct().forEach(s-> System.out.println(" the unique numbers from the list is as " +s));

        // sort it and give the element on the third index
        List<Integer> li = values.stream().sorted().collect(Collectors.toList());
        System.out.println(" The element on third index is " +li.get(2));


    }

    private static void streamMap(ArrayList<String> list) {

        //Print names which ends with "a" and convert it to uppercase
        System.out.println(" inside stream Map");
        Stream.of("Abhijeet", "Don", "Alekhya", "Aanya").filter(s-> s.endsWith("a")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        // Print names which have first letter as a with uppercase and sorted

        System.out.println("Print names which have first letter as a with uppercase and sorted");
        List<String> names1List = Arrays.asList("Abhijeet", "Don", "Alekhya", "Aanya");
        names1List.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        List<String> names2List = Arrays.asList("Men", "Women", "Adiwasi");


        // Merge two lists
        Stream<String> newStream = Stream.concat(names1List.stream(),names2List.stream());
        System.out.println("The merged sorted lists is as below");
        //newStream.sorted().forEach(s-> System.out.println(s));

        //Check if any particular string is present inside list then use anyMatch
        boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Alekhya"));
        System.out.println(" The flag " +flag);


    }

    private static void streamFilter(List<String> nameList) {

        Long c = nameList.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        // There is no life for intermediate op if there is no terminal op
        //terminal operation will execute only if intermediate op(filter) returns true
        //How to use filter in Stream API

        Long d = Stream.of("Abhijeet", "Don", "Alekhya", "Aanya").filter(s ->
        {
            s.startsWith("A");
            //return false;
            return true;
        }).count();

   // }).count() -- this(Terminal op) will not execute if returned false by intermediate op

    // Print all the names of ArrayList where length is greater than 4

    //nameList.stream().filter(s->s.length()>4).forEach(s-> System.out.println(" The strings which has length gretaer than 4 are " +s));
    nameList.stream().filter(s->s.length()>4).limit(1).forEach(s-> System.out.println(" The strings which has length gretaer than 4 are " +s));





    }

    public static int findNoOfStrings(List<String> list){
        int count =0;
        for(String l : list){
            if(l.startsWith("A")){
                count ++;
            }
        }
        //System.out.println(count);
        return count;
    }




}
