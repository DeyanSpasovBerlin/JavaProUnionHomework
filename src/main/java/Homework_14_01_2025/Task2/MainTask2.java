package Homework_14_01_2025.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MainTask2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        ArrayMaker arrM = new ArrayMaker();
        ArrayList<Integer> arr = arrM.arrMake();
        System.out.print(arr);
        System.out.println("---------");
        start = System.currentTimeMillis();
        arr.stream().sorted().forEach(i->{
            System.out.print("\t"+i);
        });
        end = System.currentTimeMillis();
        System.out.println("---------");
        System.out.println("Time spent, sequentially: " + (end - start));
        System.out.println("---------");
        start = System.currentTimeMillis();
        Stream<Integer> sorted = arr.stream().sorted().parallel();
        sorted.forEach(i->{
              System.out.print("\t"+i);});

        end = System.currentTimeMillis();
        System.out.println("---------");
        System.out.println("Time spent, parallel: " + (end - start));


    }
}
