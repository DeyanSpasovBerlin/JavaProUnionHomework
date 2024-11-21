package org.example.Homework_19_11_2024.Task1;

public class GenerateStringList {

    public String[]  makeStringArr(String text){
        String[] splitTextArr;
        String spliter = "[,. ?\\[\\]()-]+";
        splitTextArr = text.split(spliter);
        return splitTextArr;
    }
}
