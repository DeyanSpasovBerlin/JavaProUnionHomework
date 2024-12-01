package org.example.Homework_28_11_2024;

import java.util.List;
import java.util.function.BinaryOperator;

public class Task1<U> {
    private U u;


    public static Integer reduceInit(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue) {
        Integer result = basicValue;
        for (Integer number : list) {
            result = operator.apply(result, number);
        }
        return result;
    }

    public U reduce (List<U> list, BinaryOperator<U> operator, U basicValue) {
        U result = basicValue;
        for (U number : list) {
            result = operator.apply(result, number);
        }
        return result;
    }

}
