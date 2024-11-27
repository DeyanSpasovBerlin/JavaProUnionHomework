package org.example.Homework_22_11_2024;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList(List.of(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0));
        List<Double> doubles = new ArrayList<>();
        for (Double d : doubleList) {
            if (d % 2 == 1) {
                doubles.add(d);
            }
        }
        System.out.println("Initial list: "+doubleList);
        System.out.println("        for (Double d : doubleList) {\n" +
                "            if (d % 2 == 1) {\n" +
                "                doubles.add(d);\n" +
                "            } = "+doubles);
        List<Double> doubles1 =  doubleList.stream().filter(d -> d % 2 == 1).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("List<Double> doubles1 =  doubleList.stream().filter(d -> d % 2 == 1)" +
                ".collect(Collectors.toCollection(ArrayList::new)); = "+doubles1);
        System.out.println("*************");
        //********************************************************************************************************************************
        List<String> list = List.of("One", "Two", "Three", "Four", "Five");
        String word = null;
        for (String t : list){
            if (t.length() == 3) {
                word = t;
                break;
            }
        }
        System.out.println("Initial list: "+list);
        System.out.println("        for (String t : list){\n" +
                "            if (t.length() == 3) {\n" +
                "                word = t;\n" +
                "                break;\n" +
                "            }\n" +
                "         = "+word);
        String word1 = String.valueOf(list.stream().filter(s -> s.length() == 3).findFirst().orElse("No word with this length!"));
        System.out.println("String word1 = String.valueOf(list.stream().filter(s -> s.length() == 3).findFirst().orElse(\"No word with this length!\")) = "+word1);
        System.out.println("*************");
        //********************************************************************************************************************************
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Initial list: "+integers);
        System.out.println("    public static int getSum(List<Integer> integers) {\n" +
                "        int oddSum = 0;\n" +
                "        for(Integer i: integers) {\n" +
                "            if(i % 2 != 0) {\n" +
                "                oddSum += i;\n" +
                "            }\n" +
                "        }\n" +
                "        return oddSum;\n" +
                "    } + "+getSum(integers));

        System.out.println("    public static int getSum1(List<Integer> integers) {\n" +
                "        return integers.stream().filter(i -> i%2 !=0).reduce(0,(acum,i) -> acum +i);\n" +
                "    } = "+getSum1(integers));

        System.out.println("*************");
        //********************************************************************************************************************************
        String[] data = {"One", "Two", "Three", "Four", "Five"};
        System.out.println("Initial list: "+Arrays.toString(data));
        System.out.println("    public static int findIndex(String[] data, String element) {\n" +
                "        for (int i = 0; i < data.length; i++) {\n" +
                "            if (data[i].equals(element)) {\n" +
                "                return i;\n" +
                "            }\n" +
                "        }\n" +
                "        return -1;\n" +
                "    } = "+findIndex(data, "Five"));
        System.out.println("    public static OptionalInt findIndex1(String[] data, String element) {\n" +
                "        return OptionalInt.of(IntStream.range(0, data.length).filter(i ->data[i].equals(element)).reduce((acum, i) -> i).orElse(-1));\n" +
                "    } = "+findIndex1(data, "Five").orElse(-1));//
        System.out.println("*************");
        //********************************************************************************************************************************
        double sum = 0.0;
        for (int i = 0; i < 10_000; i++) {
            sum += 0.1;
        }
        System.out.println("        double sum = 0.0;\n" +
                "        for (int i = 0; i < 10_000; i++) {\n" +
                "            sum += 0.1;\n" +
                "        } = "+sum);
        Integer[] data1 = new Integer[10000];
        IntStream.range(0, 10000).forEach(i -> data1[i] = i);
        List<Double> db = (Arrays.stream(data1).map(i -> 0.1)).toList();
        System.out.println("        Integer[] data1 = new Integer[10000];\n" +
                "        IntStream.range(0, 10000).forEach(i -> data1[i] = i);\n" +
                "        List<Double> db = (Arrays.stream(data1).map(i -> 0.1)).toList();\n" +
                "db.stream().reduce(0.0, (accumulator, data2) -> accumulator +data2)" +
                " = "+db.stream().reduce(0.0, (accumulator, data2) -> accumulator +data2));
        System.out.println("*************");
        //********************************************************************************************************************************
        List<Integer> listTask1_f = new ArrayList<>();
        System.out.println("Initial list: "+listTask1_f);
        fill(listTask1_f,5);
        System.out.println("After     public static void fill(List<Integer> list, int capacity) {\n" +
                "        for (int i = 0; i < capacity; i++) {\n" +
                "            list.add(i);\n" +
                "        }\n" +
                "    } = "+listTask1_f );
        List<Integer> listTask1_f1 = new ArrayList<>();
        System.out.println("Initial listTask1_f = "+listTask1_f1);
        fill2(listTask1_f1,5);
        System.out.println("After         public static void fill2(List<Integer> list, int capacity) {\n" +
                "        IntStream.range(0,capacity).filter(i -> i<capacity).forEach(i -> list.add(i));\n" +
                "    } = "+listTask1_f1 );
        System.out.println("*************");
        //********************************************************************************************************************************
        //g)
        Set<String> names = Set.of("Ivan", "Peter", "William", "Mary");
        Set<Integer> integerSet = new TreeSet<>();
        for (String s : names) {
            integerSet.add(s.length());
        }
        System.out.println("Initial list: "+names);
        System.out.println("        Set<String> names = Set.of(\"Ivan\", \"Peter\", \"William\", \"Mary\");\n" +
                "        Set<Integer> integerSet = new TreeSet<>();\n" +
                "        for (String s : names) {\n" +
                "            integerSet.add(s.length());\n" +
                "        } = "+integerSet);
        System.out.println("names.stream().map(s -> s.length()).distinct().toList()) = "+names.stream().map(s -> s.length()).distinct().toList());
        System.out.println("*************");
        //********************************************************************************************************************************
        System.out.println("h)\n" +
                        "\tpublic static Map<Boolean, List<Integer>> getMa:......" );
        System.out.println(getMap());
        System.out.println(getMap1());
        System.out.println("*************");
        System.out.println("*************");
    }
    public static int getSum(List<Integer> integers) {
        int oddSum = 0;
        for(Integer i: integers) {
            if(i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }

    public static int getSum1(List<Integer> integers) {
        return integers.stream().filter(i -> i%2 !=0).reduce(0,(acum,i) -> acum +i);
    }
    //***************
    public static int findIndex(String[] data, String element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public static OptionalInt findIndex1(String[] data, String element) {
        return OptionalInt.of(IntStream.range(0, data.length).filter(i ->data[i].equals(element)).reduce((acum, i) -> i).orElse(-1));
    }
    //**********************
    //f)
    public static void fill(List<Integer> list, int capacity) {
        for (int i = 0; i < capacity; i++) {
            list.add(i);
        }
    }
    public static void fill2(List<Integer> list, int capacity) {
        IntStream.range(0,capacity).filter(i -> i<capacity).forEach(i -> list.add(i));
    }
    //**********************
    //h)
    public static Map<Boolean, List<Integer>> getMap() {
        Map<Boolean, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                if (map.containsKey(true)) {
                    map.get(true).add(i);
                } else {
                    map.put(true, new ArrayList<>());
                    map.get(true).add(i);
                }
            } else {
                if (map.containsKey(false)) {
                    map.get(false).add(i);
                } else {
                    map.put(false, new ArrayList<>());
                    map.get(false).add(i);
                }
            }
        }
        return map;
    }
    public static Map<Boolean, List<Integer>> getMap1() {
        List<Integer> list = new ArrayList<>(100);
        IntStream.range(0,100).forEach(i -> list.add(i));
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i ->i%3 ==0));
        return map;
    }
    //**********************
}



