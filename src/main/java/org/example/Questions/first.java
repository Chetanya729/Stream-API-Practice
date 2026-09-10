package org.example.Questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class first {
    static void main() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = list.stream().filter(x->x%2==0).toList();
        System.out.println("Even NUmbers "+ evenNumbers);

        List<Integer> oddNumbers = list.stream().filter(x->x%2!=0).toList();
        System.out.println("Odd numbers: " + oddNumbers);

        List<Integer> list2 = List.of(10,20,30,40,50);
        int sum = list2.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list2: " + sum);

        List<Integer> list3 = List.of(15, 42, 7, 89, 23, 56);
        Double average = list3.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average of list3: " + average);
        int minimum = list3.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println("Minimum of list3: " + minimum);

        List<Integer> list4 = List.of(10, 20, 30, 40, 50, 60, 70);
        long counter = list4.size();
        System.out.println("Count of list4: " + counter);

        List<Integer> list5 = List.of(1, 2, 2, 3, 4, 4, 5, 5, 5, 6);
        System.out.println(list5);
        List<Integer> nonDuplicates = list5.stream().distinct().toList();
        System.out.println("Non-duplicates in list5: " + nonDuplicates);

        List<Integer> list6 = List.of(45, 12, 78, 3, 56, 23, 9 ,1112 , -112, -2234);
        System.out.println(list6);
        List<Integer> sortedList = list6.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println("Sorted list6: " + sortedList);
        List<Integer> reversedList = list6.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reversed List:" + reversedList);


        Optional<Integer> greatest = list6.stream().filter(x->x>100).findFirst();
        greatest.ifPresent(System.out::println);


        List<Integer> greaterThan0 = list6.stream().filter(x->x>0).toList();
        System.out.println(greaterThan0);

        Optional<Integer> firstElement = list6.stream().findFirst();
        firstElement.ifPresent(System.out::println);

        List<Integer> list7 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 2, 7,7,66);
        System.out.println("List 7 :" + list7);
        List<Integer> onlyduplicate = list7.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Only duplicates are: "+onlyduplicate);

        List<Integer> list8 = List.of(10, 85, 32, 67, 95, 45, 78, 100, 23);
        System.out.println("List 8:" + list8);
        int targetIndex = 1;
        Optional<Integer> secondHighest = list8.stream().sorted(Comparator.reverseOrder()).skip(targetIndex).findFirst();
        secondHighest.ifPresent(System.out::println);

        Optional<Integer>secondSmallest = list8.stream().sorted(Comparator.naturalOrder()).skip(targetIndex).findFirst();
        secondSmallest.ifPresent(System.out::println);
        int targetIndex2 = 3;
        List<Integer> first3largest = list8.stream().sorted(Comparator.reverseOrder()).limit(targetIndex2).toList();
        System.out.println(first3largest);

        List<Integer> last3lowest = list8.stream().sorted(Comparator.naturalOrder()).limit(targetIndex2).toList();
        System.out.println(last3lowest);

        Map<Boolean,List<Integer>> partitionedList = list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(partitionedList);

    }
}