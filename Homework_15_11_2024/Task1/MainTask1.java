package org.example.Homework_15_11_2024.Task1;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import static java.util.Collections.shuffle;

public class MainTask1 {
    public static void main(String[] args) {
        Reservuar re = new Reservuar();
        Supplier<String> randomJoke =() ->{
            return re.getInputList().get(new Random().nextInt(re.getInputList().size()));
        };
        System.out.println(randomJoke.get());
    }
}


/*
 Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.
     // void -> void
    // data -> void ---- Consumer ---- accept()
    // void -> data ---- Supplier ---- get()
    // data1 -> data2 ---- Function - UnaryOperator ---- apply()
    // (data1, data2) -> data3 ---- BiFunction - BinaryOperator ---- apply()
    // data -> boolean ----- Predicate ---- test()

 */