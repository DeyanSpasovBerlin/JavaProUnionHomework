package org.example.Homework_22_11_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task2 {
    public  Integer exactSquare(int n){
        List<Integer> list = new ArrayList<>(n);
        IntStream.range(0,n).forEach(i -> list.add(i));
        int res = list.stream().filter(i -> i*i == n).findAny().orElse(-1);
        return  res;
    }
    public  void find3Number(Integer a, Integer b) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        IntStream.range(1,21).forEach(i -> {list1.add(i);list2.add(i);});
        List<List<Integer>> combinations3Num = list1.stream()
                .flatMap(i -> list2.stream().map(i1 -> List.of(i, i1,exactSquare(i*i+i1*i1))))
                .filter(l -> l.get(2) !=-1 ).filter( m -> Math.pow(m.get(2),2) < 1000)
                .toList();
        System.out.println(combinations3Num);
    }
}
