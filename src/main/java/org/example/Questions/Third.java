package org.example.Questions;

import javax.sound.midi.SoundbankResource;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Third {

    static void main() {
        List<Integer> list1 = List.of(10,22,344,3,5,333);
        List<Integer> list2 = List.of(12,33,4,10,22);
        Set<Integer> set1 = new HashSet<>(list2);

        List<Integer> commonEle = list1.stream().filter(set1::contains).toList();
        System.out.println(commonEle);

        List<Integer> notCommon = list1.stream().filter(e->!set1.contains(e)).toList();
        System.out.println(notCommon);

        List<List<Integer>> elements = List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
        List<Integer> changedToList = elements.stream().flatMap(List::stream).toList();
        System.out.println(changedToList);

        Integer sum = elements.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
