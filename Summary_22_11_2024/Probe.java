package org.example.Summary_22_11_2024;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Probe {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<Integer> combinations = Stream.of(list1,list2)
                .flatMap(List::stream).toList();
        System.out.println(combinations);
       Set<List<Integer>> combinations1 = Stream.of(list1,list2).collect(Collectors.toSet());
        System.out.println(combinations1);
        List<String> combinations3 = (List<String>) list1.stream().flatMap(i -> list2.stream().map(k->"("+i+","+k+")")).toList();
        System.out.println(combinations3);
        List<Integer> combinations4 = (List<Integer>) list1.stream().flatMap(i -> list2.stream().map(k->i+k)).toList();
        System.out.println(combinations4);
        List<Integer> combinations5 = (List<Integer>) list1.stream().flatMap(i -> list2.stream().
                map(k->i+k)).filter(i -> i==8).toList();
        System.out.println(combinations5);
//        List<String> combinations6 =  list1.stream().flatMap(i -> list2.stream()
//                .toList(); //.map(k-> i+""+k)).filter(s->Integer.valueOf(s)==6)
        System.out.println(list1.stream().flatMap(i -> list2.stream()).toList());

        // System.out.println(combinations6);
    }
}
