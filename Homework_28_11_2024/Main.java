package org.example.Homework_28_11_2024;
import java.util.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task1<Integer> task1 = new Task1<>();
        List<Integer> list = List.of(1, 2, 3, -7, 1, 9, 6);

        System.out.println(task1.reduce(list, Integer::sum, 0)); // sum of numbers

        System.out.println(task1.reduce(list, (accumulator, data) -> accumulator * data, 1)); // multiply

        System.out.println(task1.reduce(list, (accumulator, data) -> accumulator + data * data, 0)); // sum of squares

        System.out.println(task1.reduce(list, Integer::max, list.iterator().next())); // max of numbers

        Task1<Double> task2 = new Task1<>();
        List<Double> list2 = List.of(1.6, 2.6, 3.4, -7.09, 1.0, 9.2, 6.2);


        System.out.println(task2.reduce(list2, Double::sum, 0.0)); // sum of numbers

        System.out.println(task2.reduce(list2, (accumulator, data) -> accumulator * data, 1.0)); // multiply

        System.out.println(task2.reduce(list2, (accumulator, data) -> accumulator + data * data, 0.0)); // sum of squares

        System.out.println(task2.reduce(list2, Double::max, Double.valueOf(list.iterator().next()))); // max of numbers

        Task1<String> task3 = new Task1<>();
        List<String>  list3 = List.of("Ana", "Ben", "Mary", "Jorg","Ivan","Jensen");
        List<Integer> list4 = list3.stream().map(s->s.length()).toList();
        System.out.println(task3.reduce(list3, (accumulator, data) -> accumulator + data,""));
        String reduce = task3.reduce(list3, (accumulator, data) ->String.valueOf(Math.max(accumulator.length(),data.length())),"");
        System.out.println(reduce);
    }
}
