package org.example.Homework_15_11_2024.Task3;

import java.util.Random;

public class DreiFunction {
    Random rand =  new Random();

    public Integer randInt(){
        return rand.nextInt(0,100);
    }

    public Integer multiplay10(Integer input){
        System.out.println("input = "+input);
        return input*10;
    }
    public String transformIntString(Integer input){
        System.out.println("input.toString() = "+input.toString());
        return input.toString();
    }
    public Integer stringSymbol(String str){
        System.out.println("str.length() = "+str.length());
        return str.length();
    }
    public String randSymb(){
        String allChar = "abcvgdeghjiklmnopqrstuvyzx";
        StringBuilder randStr = new StringBuilder();
        int strLength = rand.nextInt(0,10);
        while (randStr.length() <= strLength){
            int indexChar = (int) (rand.nextFloat()*allChar.length());
            randStr.append(allChar.toUpperCase().charAt(indexChar));
        }
        System.out.println("randStr.toString() = "+randStr.toString());
        return randStr.toString();
    }
}
