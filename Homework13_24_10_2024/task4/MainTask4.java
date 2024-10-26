package org.example.Homework13_24_10_2024.task4;

import org.example.Homework13_24_10_2024.task1And2.HomeworkTask;

public class MainTask4 {
    public static void main(String[] args) {

        HomeworkTask taskText = new HomeworkTask();
        taskText.readFile("Task.txt");

        Task4 task = new Task4();
        task.getIndex(2);
        System.out.println("******************");
        task.getIndexIterator(2);

        task.getIndex(1);
        System.out.println("******************");
        task.getIndexIterator(1);

        task.getIndex(0);
        System.out.println("******************");
        task.getIndexIterator(0);

        task.getIndex(99);
        System.out.println("******************");
        task.getIndexIterator(99);
    }
}
