package org.example.Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Second {
    static void main() {
        List<String> str1 = List.of("java", "programming", "spring", "hibernate", "docker");
        List<String> strToUpperCase = new ArrayList<>(str1.stream().map(String::toUpperCase).toList());
        System.out.println(strToUpperCase);

        List<String> str2 = Arrays.asList("Banana","Orange","Apple","avocado","Amazon","Mango");
        List<String> startWithA = str2.stream().filter(x -> x.toLowerCase().startsWith("a")).toList();
        System.out.println("Starts with A list: "+startWithA);

        List<String> str3 = List.of("Java , hello", "hi , how are you", "hello , what doing" , "why", "howww" , "notnow", "donwWithTheProject");
        List<String> lengthGreaterThan5 = str3.stream().filter(x -> x.length()>=5).toList();
        System.out.println("Strings of length greater than 5"+lengthGreaterThan5);

        List<String> commaSeparated = str3.stream().flatMap(x -> Arrays.stream(x.split(","))).map(String::trim).collect(Collectors.toList());
        System.out.println(commaSeparated);

        String str = "hellohhee";
        Optional<Character> nonRepeated = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()==1).map(entry->entry.getKey()).findFirst();
        nonRepeated.ifPresent(System.out::println);

        List<String> str4 = List.of("AWS","SQL","JAVA" ,"Python" , "C++","Docker" , "AWS","SQL" , "Java");
        Map<Integer,List<String>> groupedBY = str4.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedBY);

        Map<String,Long> counter = str4.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(counter);
    }

}
