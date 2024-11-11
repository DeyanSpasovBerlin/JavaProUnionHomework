package org.example.Homework_08_11_2024.Task2;

public class GenerateStringList {

    public String[]  makeStringArr(String text){
        String[] splitTextArr;
        String spliter = "[,. ?\\[\\]()-]+";
        splitTextArr = text.split(spliter);
        return splitTextArr;
    }
}
