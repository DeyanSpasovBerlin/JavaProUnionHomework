package org.example.Homework_19_11_2024;

import org.example.Homework_19_11_2024.Task5.Task5;

import java.util.Scanner;

public class Start {
    Scanner reader = new Scanner(System.in);
   Task5 task5 = new Task5();
    public  void start() {

        Boolean flag = true;
        while (flag) {
            System.out.print("\tTask1         \t Exit\n");
            System.out.print("\t  5            \t  E\n");
            String chois = reader.nextLine().toUpperCase();
            switch (chois) {
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
