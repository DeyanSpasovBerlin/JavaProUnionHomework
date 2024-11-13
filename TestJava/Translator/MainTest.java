package org.example.TestJava.Translator;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {

        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("run","laufen");
        dictionary.put("drink","laufen");
        dictionary.put("sleep","schlafen");
        dictionary.put("read","lesen");
        dictionary.put("Watch","Siehe");
        dictionary.put("laugh","lachen");

        Translator transl = new Translator(dictionary);
        transl.start();
    }
}









