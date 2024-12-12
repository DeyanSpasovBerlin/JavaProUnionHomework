package org.example.Homework_28_11_2024;

import java.util.Iterator;

public class UseMyArrayList {

    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList(new String[] {"A", "B", "C", "D", "E"});

        Iterable<String> myList = new MyArrayList(new String[] {"A", "B", "C", "D", "E"});
        Iterator<String> iterator = myList.iterator();
        Iterator<String> iterator2 = myList.iterator();


        for (String s : myList) {
            String element = s;
            System.out.println(element);
        }

        // revereIterator E --> D --> C --> B --> A
        Iterator<String> reversed = myArrayList.reverseIterator();
        while (reversed.hasNext()){
            System.out.println(reversed.next());
        }


        MyArrayList<Integer> myArrayListInt = new MyArrayList(new Integer[] {1, 5, 11, 16, 17});

        Iterable<Integer> myListInt = new MyArrayList(new Integer[] {1, 5, 11, 16, 17});
        Iterator<Integer> iterator3 = myListInt.iterator();
        Iterator<Integer> iterator4 = myListInt.iterator();

        for (Integer s : myListInt) {
            Integer element = s;
            System.out.println(element);
        }

        Iterator<Integer> reversed1 = myArrayListInt.reverseIterator();
        while (reversed1.hasNext()){
            System.out.println(reversed1.next());
        }

//        Iterator<String> iterator = myArrayList.iterator();
//        System.out.println(iterator.next());

//        myArrayList = new MyArrayList(new String[0]);
//        for (String s : myArrayList) {
//            String element = s;
//            System.out.println(element);
//        }
//
//        myArrayList = new MyArrayList(new String[] {"A"});
//        for (String s : myArrayList) {
//            String element = s;
//            System.out.println(element);
//        }
//
//        Iterator<String> iterator = myArrayList.iterator();
//        iterator.next();
////        iterator.next(); // impossible

    }


}
