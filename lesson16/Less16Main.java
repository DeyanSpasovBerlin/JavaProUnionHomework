package org.example.lesson16;

import java.util.*;

public class Less16Main {
    // 1. Set<String> names ------> Set<Integer> длины имен
    // 2. Имеется текст "Hello world!!!". Вывести уникальный набор символов
    // 3. Имеется список Integer, отсортировать его через set
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 2, 3, -2, 5, 12, 60, -10));
        System.out.println("Original list is:");
        System.out.println(list);
        System.out.println("-------------");
        System.out.println("TreeSet is:");
        SortedSet<Integer> set = new TreeSet<>(sortWithSet(list));
        System.out.println(set);
        System.out.println("-------------");
        System.out.println("New list is:");
        list = transformSetToList(set, list);
        System.out.println(list);
        System.out.println("-------------");
        String str = "Hello world!!!";
        System.out.println("Original String is:");
        System.out.println(str);
        System.out.println("-------------");
        System.out.println("TreeSet of Char is:");
        Set<Character> setChar = new TreeSet<>();
        setChar = transformStringToSet(str);
        System.out.println(setChar);
        System.out.println("-------------");
        String text2 = "Хотите услышать мое излюбленное определение человека? Это существо, " +
                "которое охотнее всего рассуждает о том, в чем меньше всего разбирается.";
        System.out.println("The original text is:");
        System.out.println(text2);
        System.out.println("-------------");
        System.out.println("The text transform to TreeSet is: ");
        SortedSet<String> setString = new TreeSet<>();
        setString =  splitTextSet(text2);
        System.out.println(setString);
        System.out.println("-------------");
        System.out.println("The TreeSet from word length is:");
        SortedSet<Integer> setInteger =  new TreeSet<>();
        setInteger = transformStringSetToIntegerSet(setString);
        System.out.println(setInteger);

    }

    public static Set<Integer> sortWithSet(List<Integer> list) {
        SortedSet<Integer> ln = new TreeSet<>(list);
        return ln;
    }

    public static List<Integer> transformSetToList(Set<Integer> set, List<Integer> list) {
        int index = 0;
        for (Integer i : set) {
            list.set(index, i);
            index++;
        }
        return list;
    }

    public static SortedSet<Character> transformStringToSet(String str) {
        SortedSet<Character> setChar = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            setChar.add(str.charAt(i));
        }
        return setChar;
    }

    public static SortedSet<String> splitTextSet(String text) {
        String[] splitTextArr;
        String spliter = "[,. ?]+";
        splitTextArr = text.split(spliter);
        SortedSet<String> splitTextSet = new TreeSet<>(Arrays.asList(text.split(spliter)));
        return splitTextSet;
    }
    public static SortedSet<Integer> transformStringSetToIntegerSet(SortedSet<String> set){
        SortedSet<Integer> setInteger = new TreeSet<>();
        for (String str : set){
            setInteger.add(str.length());
        }
        return setInteger;
    }

}
