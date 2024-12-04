package org.example.Homework_04_12_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        try (
                Scanner scanner = new Scanner(new File("Homework_04_12_2024/File1.txt"));
        ) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Task2 task2 = new Task2();
        task2.call3Method();

    }
}
