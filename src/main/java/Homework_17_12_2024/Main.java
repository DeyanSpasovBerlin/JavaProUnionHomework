package Homework_17_12_2024;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyTread myTread = new MyTread();

        int maxNumber = 200_000;
        long start = System.currentTimeMillis();
        ArrayList<Integer> primeNumber = myTread.computeSequentially(maxNumber);
        long end = System.currentTimeMillis();
        System.out.println("Total numbers of prime: " + primeNumber.get(0));
        myTread.printLast5PrimeNum(primeNumber);
        System.out.println("Time elapsed, sequentially:" + (end - start));
        System.out.println("-----------");

        start = System.currentTimeMillis();
        ArrayList<Integer> result = myTread.computeParallel();
        end = System.currentTimeMillis();
        System.out.println("Time elapsed, parallel:" + (end - start));

    }

}
