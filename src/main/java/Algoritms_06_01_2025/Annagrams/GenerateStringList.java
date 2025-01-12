package Algoritms_06_01_2025.Annagrams;

public class GenerateStringList {

    public String[]  makeStringArr(String text){
        String[] splitTextArr;
        String spliter = "[ a-z^,.%0123456789]+";//"[,. ?\\[\\]()-]+";
        splitTextArr = text.split(spliter);
        return splitTextArr;
    }
}


