package org.example.lesson16;

import java.util.*;

public class PraktikumTask {

    public static void main(String[] args) {
        String word = "RACECAR";
        char[] charArr = transformWordToCharArr(word);
        System.out.println(Arrays.toString(charArr));
         Boolean bol = isPalindrome(charArr);
        System.out.println(bol);
        System.out.println("------------------");
        String word1 = "radar";
        char[] charArr1 = transformWordToCharArr(word1);
        System.out.println(Arrays.toString(charArr1));
        Boolean bol1 = isPalindrome(charArr1);
        System.out.println(bol1);
        System.out.println("------------------");
        String word2 = "level";
        char[] charArr2 = transformWordToCharArr(word2);
        System.out.println(Arrays.toString(charArr2));
        Boolean bol2 = isPalindrome(charArr2);
        System.out.println(bol2);
        System.out.println("------------------");
        String word3 = "kayak";
        char[] charArr3 = transformWordToCharArr(word3);
        System.out.println(Arrays.toString(charArr3));
        Boolean bol3 = isPalindrome(charArr3);
        System.out.println(bol3);
        System.out.println("------------------");

    }



    public static Boolean isPalindrome(char[] charArray){
        Boolean result = true;
        for (int i = 0; 0 <= charArray.length-1-2*i; i++) {
            if(charArray[i] == charArray[charArray.length-1-i]){
                result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
    public static char[] transformWordToCharArr(String str){//
        char[] charArray = str.toCharArray();
        return charArray;
    }

}
