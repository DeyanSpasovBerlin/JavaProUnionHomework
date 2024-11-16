package org.example.Homework_15_11_2024.Task2;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class MaimTask2 {
    public static void main(String[] args) {
        Task2 t2 = new Task2();

        Consumer<Integer> oddEvenPrint = e -> {
            if(e%2 == 0){
                System.out.println("Odd = "+e);
            }else {
                System.err.println("Even = "+e);
            }
        };

        Consumer<Integer> newEvennOdd = a -> {
            System.out.println("This number is not interesting!");
        };
        System.out.println("First variant:");
        oddEvenPrint.accept(t2.getNumber());

        System.out.println("----------------");
        System.out.println("Second variant:");
        IntStream.range(1,10).forEach(i -> {
                    if (i < 5 && i % 2 == 0) {
                        newEvennOdd.accept(t2.getNumber());
                    } else {
                        oddEvenPrint.accept(t2.getNumber());
                    }
                }
        );
    }
}





// void -> void
// data -> void ---- Consumer ---- accept()
// void -> data ---- Supplier ---- get()
// data1 -> data2 ---- Function - UnaryOperator ---- apply()
// (data1, data2) -> data3 ---- BiFunction - BinaryOperator ---- apply()
// data -> boolean ----- Predicate ---- test()