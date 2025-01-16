package Homework_14_01_2025.Task2;

import java.util.ArrayList;
import java.util.Random;

public class ArrayMaker {
    Random rand = new Random();
    int i = 0;
    public ArrayList<Integer> arrMake(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (i<100){
            arr.add(rand.nextInt(100));
            i++;
        }
        return arr;
    }
}
