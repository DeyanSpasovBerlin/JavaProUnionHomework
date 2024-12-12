package org.example.Homework13_24_10_2024.task1And2;

import java.util.LinkedList;

public class MainTask1And2 {
    public static void main(String[] args) {

        HomeworkTask taskText = new HomeworkTask();
        taskText.readFile(taskText.fileInfo("Task.txt"));

        GenerateLinkedList genLin1 = new GenerateLinkedList();
        System.out.println("We have the next text: ");
        System.out.println(genLin1.getText1());
        System.out.println("******************");
        LinkedList<String> lin1 = genLin1.splitText(genLin1.getText1());
        System.out.println("******************");
        genLin1.getShortestString(lin1);
        System.out.println("******************");
        genLin1.getShortestStringIter(lin1);
        System.out.println("******************");
        genLin1.getConcatString(lin1);
        System.out.println("******************");
        genLin1.getConcatStringWithIter(lin1);
    }
}
//1. Перебрать LinkedList и найти самую короткую строку.
//Перебрать LinkedList и объединить все строки в одну с использованием
//разделителя "|".