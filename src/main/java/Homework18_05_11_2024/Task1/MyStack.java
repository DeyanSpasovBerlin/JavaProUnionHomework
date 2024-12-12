package org.example.Homework18_05_11_2024.Task1;

/*
1 уровень сложности: 1. Реализовать стек на основе массива. Создать класс MyStack:
реализовать для него методы push(), pop(), peek(), size(), isEmpty().
Размер стека определяется на этапе создания. При попытке добавить элемент в заполненный стек выбрасывается exception.
Протестировать работу класса.
 */

import java.util.Arrays;

public class MyStack {
    public static String text = "Жизнь, господа присяжные заседатели, это сложная штука," +
            " но, господа присяжные заседатели, эта сложная штука открывается " +
            "просто, как ящик. Надо только уметь его открыть. Кто не может открыть," +
            " тот пропадает. ";
    public static GenerateStringList gsl = new GenerateStringList();
    public static String[] s = gsl.makeStringArr(text);
    public  static Integer lg = s.length;
    //Integer lg;

    private String[] data = new String[lg ];


    public void push(String str) {
        int ind = data.length-1;
        while (data[ind] != null && ind >0) {
            ind--;
        }
        System.out.println("ind= "+ind);
        if (ind >= 0) {
            for (int i = ind; i <data.length-1; i++) {
                data[i ] = data[i+1];
            }
        } else {
            System.out.println("No empty nod!");
        }
        data[data.length - 1] = str;
        System.out.println(Arrays.toString(data));
    }

    public String pop(){
        String result = null;
        int ind = data.length-1;
        while (data[ind] != null && ind >0) {
            ind--;
        }
        System.out.println("ind= "+ind);
        if( ind == data.length-1){
            System.out.println(" The stack is empty!");
        }
            result = data[data.length-1];
            for (int i = data.length-1; i >ind; i--) {
                data[i]= data[i-1];
            }
            data[ind] = null;
        System.out.println(Arrays.toString(data));
        return result;
    }
    public String peek(){
        return data[data.length-1];
    }
    public int size(){
        return data.length;
    }
    public Boolean isEmpty(){
        Boolean result = null;
        int ind = data.length-1;
        while (data[ind] != null && ind >0) {
            ind--;
        }
        if( ind == data.length-1) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }


}

