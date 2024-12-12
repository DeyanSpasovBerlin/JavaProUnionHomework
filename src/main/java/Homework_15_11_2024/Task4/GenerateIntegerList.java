package org.example.Homework_15_11_2024.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;

public class GenerateIntegerList {
    Random rand = new Random();
    public List<Integer> getList(){
        int len = rand.nextInt(1,10);
        List<Integer> inputList = new ArrayList<>(len);
        for (int i =0; i < len; i++){
            inputList.add(i,rand.nextInt(0,99)); ;
        }
        return inputList;
    }

public Integer getStartValue(List<Integer> input){
        int upperBond = input.size();
        return rand.nextInt(0,upperBond);
    }

public Long reduce(List<Integer> inputList,BinaryOperator<Integer> bo, Integer startValue) {
    //Integer result = 1;
    //BinaryOperator<Integer> bo = (e,u) -> (int) (e* Math.pow(e,u));
    Long result = 1L;
    for (int i = startValue; i < inputList.size(); i++) {
        result = Long.valueOf(bo.apply(inputList.get(i), Math.toIntExact(result)));
    }
    return result;
}

}


// void -> void
// data -> void ---- Consumer ---- accept()
// void -> data ---- Supplier ---- get()
// data1 -> data2 ---- Function - UnaryOperator ---- apply()
// (data1, data2) -> data3 ---- BiFunction - BinaryOperator ---- apply()
// data -> boolean ----- Predicate ---- test()