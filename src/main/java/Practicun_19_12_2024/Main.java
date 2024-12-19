package Practicun_19_12_2024;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Жизнь, господа присяжные заседатели, это сложная штука," +
                " но, господа присяжные заседатели, эта сложная штука открывается " +
                "просто, как ящик. Надо только уметь его открыть. Кто не может открыть," +
                " тот пропадает. ";

    }

    public ArrayList<Integer> meth1(int minNumber, int maxNumber) {
        ArrayList<Integer> primeNumber = new ArrayList<Integer>(List.of(0));
        new Thread(() -> {
            int count = 0;
            for (int i = minNumber; i < maxNumber; i++) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    primeNumber.set(0, count);
                count++;
                primeNumber.add(i);
            }
        }, "thread1").start();
        return  primeNumber;
    }

    public String[]  makeStringArr(String text) {
        final String[][] splitTextArr = {null};
        new Thread(() -> {
            String spliter = "[,. ?]+";
            splitTextArr[0] = text.split(spliter);
        }, "thread2").start();
        return splitTextArr[0];
    }
}
//https://github.com/EgorovMikhai1/_081024.git