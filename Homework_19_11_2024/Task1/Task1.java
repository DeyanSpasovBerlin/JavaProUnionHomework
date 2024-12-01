package org.example.Homework_19_11_2024.Task1;


import java.util.Arrays;

public class Task1 {
    private String[] initStr = getStringArr();

    public String[] getStringArr(){
        String[] strArr ;
        TextContein txt = new TextContein();
        String text = txt.getText();
        GenerateStringList gsl = new GenerateStringList();
        String[] txtList = gsl.makeStringArr(text);
//        System.out.println("Initial String array:");
//        System.out.println(Arrays.toString(txtList));
        return  txtList;
    }
    public void unicWords (String[] initStr){
        System.out.println("Initial String array:");
        System.out.println(Arrays.toString(initStr));
        System.out.println("С помощью стримов посчитать количество неповторяющихся слов в списке");
        System.out.println(Arrays.stream(initStr).distinct().count());
    }
}
