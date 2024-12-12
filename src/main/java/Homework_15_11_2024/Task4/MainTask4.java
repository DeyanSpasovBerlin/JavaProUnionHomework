package org.example.Homework_15_11_2024.Task4;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class MainTask4 {

    public static void main(String[] args) {
        GenerateIntegerList gl = new GenerateIntegerList();
        IntStream.range(0,5).forEach(i -> {
            System.out.println("№ " + i);
            List<Integer> inputList = gl.getList();
            System.out.println("inputList = " + inputList);
            Integer startValue = gl.getStartValue(inputList);
            System.out.println("startValue = " + startValue);
            System.out.println("Sum all meembers from 0 to end: ");
            System.out.println(gl.reduce(inputList, (u, v) -> u + v, 0) - 1);
            System.out.println("Sum all meembers from " + startValue + " to end: ");
            System.out.println(gl.reduce(inputList, (u, v) -> u + v, startValue) - 1);
            System.out.println("Product all meembers from 0 to end: ");
            System.out.println(gl.reduce(inputList, (u, v) -> u * v, 0));
            System.out.println("Product all meembers from " + startValue + " to end: ");
            System.out.println(gl.reduce(inputList, (u, v) -> u * v, startValue));
            System.out.println("----------");
        });
    }
}



/*
4.Написать метод reduce(), который на вход принимает список чисел, оператор двух аргументов и начальное значение.
public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue)
Метод накапливает результат применения оператора по всем данных, начиная с начального значения.
Например, вызов
    reduce(list, Integer::sum, 0)) должен вернуть сумму всех чисел
    reduce(list, (i, j) -> i * j, 1) должен вернуть произведение всех чисел

 */