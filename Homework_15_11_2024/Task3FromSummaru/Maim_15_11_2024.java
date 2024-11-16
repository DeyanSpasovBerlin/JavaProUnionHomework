package org.example.Homework_15_11_2024.Task3FromSummaru;

import java.util.ArrayList;
import java.util.List;

public class Maim_15_11_2024 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("A");
        str.add("BB");
        str.add("CCC");
        str.add("DDDD");
        str.add("EEEEE");
        System.out.println(str);
        System.out.println("------------------");
        Task3 t = new Task3();
        Filter fil1 = new Filter() {
            @Override
            public boolean apply(String s) {
                boolean result = true;
                if (s.length() == 2) {
                    System.out.println("Long2!");
                    result = true;
                    System.out.println(result);
                } else if (s.length() == 3) {
                    System.out.println("Long3!");
                    result = true;
                    System.out.println(result);
                } else {
                    System.out.println("Long is dif from 2 and 3!");
                    result = false;
                    System.out.println(result);
                }
                return result;
            }
        };
        Filter fil2 = new Filter() {
            @Override
            public boolean apply(String s) {
                boolean result = true;
                if(s.length() == 2){
                    System.out.println(s.toUpperCase());
                    result = true;
                    System.out.println(result);
                } else if (s.length() == 3) {
                    System.out.println(s.toLowerCase());
                    result = true;
                    System.out.println(result);
                } else if (s.toUpperCase().equals("A")) {
                    System.out.println("This is A");
                    result = true;
                    System.out.println(result);

                }else {
                    System.out.println("This is not A or not 2 lett, or not 3 lett!!!");
                }
                return result;
            }
        };

        t.probe(fil1,str);
        System.out.println("------------------");
        t.probe(fil2,str);
    }
}
