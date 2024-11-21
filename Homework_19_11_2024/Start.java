package org.example.Homework_19_11_2024;

import org.example.Homework_19_11_2024.Task1.Task1;
import org.example.Homework_19_11_2024.Task2.Task2;
import org.example.Homework_19_11_2024.Task3.Task3;
import org.example.Homework_19_11_2024.Task4.Task4;
import org.example.Homework_19_11_2024.Task5.Task5;

import java.util.Scanner;

public class Start {
    Scanner reader = new Scanner(System.in);
   Task5 task5 = new Task5();
   Task1  task1 = new Task1();
    Task2 task2 = new Task2();
    Task3 task3 = new Task3();
    Task4 task4 = new Task4();
    public  void start() {

        Boolean flag = true;
        while (flag) {
            System.out.print("\tTask1    \tTask2    \tTask3    \tTask4    \tTask5          \t Exit\n");
            System.out.print("\t  1       \t  2      \t  3      \t  4      \t  5            \t  E\n");
            String chois = reader.nextLine().toUpperCase();
            switch (chois) {
                case  "1" -> {
                    task1.unicWords(task1.getStringArr());
                }
                case  "2" -> {
                    task2.nameTom();
                }
                case  "3" -> {
                    task3.findName();
                }
                case  "4" -> {
                    task4.catStat();
                }
                case  "5" -> {
                    task5.task5();
                }
                case "E" -> {
                    System.out.println("GOOOOOODbyе!");
                    flag = false;
                }
                default -> System.out.println(" Only Y and E are allowed!");
            }
        }
    }
}
