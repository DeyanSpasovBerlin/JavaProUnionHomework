package org.example.lesson14_29_10_2024;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainLesson14_29_10_2024 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        Work work = new Work();
        work.searc(list,"H");

    }
}
