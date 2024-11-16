package org.example.Homework_15_11_2024.Task3;


import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class MainTask3 {
    public static void main(String[] args) {
        DreiFunction df = new DreiFunction();
        UnaryOperator<Integer> unInt = e -> df.multiplay10(e);
        Function<Integer,String> intToString = e -> df.transformIntString(e);
        Function<String,Integer> numSymb = str -> df.stringSymbol(str);

        System.out.println("Function randInt() "+df.randInt());
        System.out.println("-------------");
        System.out.println("First function: "+unInt.apply(df.randInt()));
        System.out.println("-------------");
        System.out.println("Second function: "+intToString.apply(df.randInt()));
        System.out.println("-------------");
        System.out.println("Third function: "+numSymb.apply(df.randSymb()));
        System.out.println("-------------");

        IntStream.range(0,5).forEach(i ->{
            System.out.println("№ "+i);
            System.out.println("Reverse order F1->F2->F3: ");
            System.out.println(unInt.andThen(intToString).andThen(numSymb).apply(df.randInt()));
            System.out.println("...............");
            System.out.println("Direct order F3->F2->F1: ");
            System.out.println(intToString.compose(unInt).compose(numSymb).apply(df.randSymb()));
            System.out.println("-------------");
        });
    }
}


/*
3. Создать три функции:
    f1 - умножает Integer на 10
    f2 - преобразует Integer в String в формате "<<123>>"
    f3 - считает число символов в String
Составить композитную функцию так, чтобы:
а) функции выполнялись последовательно друг за другом f1 -> f2 -> f3
Input:
777
Output:
8
б) в порядке f3 -> f1 -> f2
Input:
"Hello!"
Output:
"<<60>>"

 */
// void -> void
// data -> void ---- Consumer ---- accept()
// void -> data ---- Supplier ---- get()
// data1 -> data2 ---- Function - UnaryOperator ---- apply()
// (data1, data2) -> data3 ---- BiFunction - BinaryOperator ---- apply()
// data -> boolean ----- Predicate ---- test()