package org.example.Homework_15_11_2024.Task2;
//2. Создать Consumer, который принимает числа и печатает четные числа в поток System.out, а нечетные числа в System.err.

import java.util.Random;

public class Task2 {
    Random rand = new Random();

    public Integer getNumber(){
        int count = 1;
        int num = rand.nextInt(0,100);
        return num;
    }
}
