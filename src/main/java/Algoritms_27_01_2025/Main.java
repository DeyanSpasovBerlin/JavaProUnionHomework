package Algoritms_27_01_2025;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(-1);
        sumSubArr(arr);
    }

    public static int sumSubArr(ArrayList<Integer> arr){
        int sum = 0;
        int buffer = 0;
        int index = -1;
        for(int i = 0; i< arr.size();i++){
            sum = sum +arr.get(i);
        }
        for(int j=1;j< arr.size();j++){
            buffer=buffer+arr.get(j);
            if(buffer == sum - buffer -arr.get(j)){
                index = j;
                break;
            }
            if(index == -1){
                System.out.println("No such element!");
            }else {
                System.out.println(("Sum elements up to " + arr.get(index) + " = " + buffer));
            }
        }
        return index;
    }

    static int[] newArrMethod(int[] inputArr ){
        int[] outPut = new int[inputArr.length];
        int sum = 0;
        int buffer = 0;
        for(int i = 0; i< inputArr.length;i++){
            sum = sum +inputArr[i];
        }
        for(int j=0;j< inputArr.length;j++) {
            buffer = buffer + inputArr[j];
            outPut[j] = sum - buffer;
        }
        return outPut;
    }

}
