package Algoritms_06_01_2025;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainMapTask {
    public static void main(String[] args) {

        int[] array1 = {7, 11, 23, 45, 3, 6, 4};
        int[] array2 = {  7 , 11,2, 15};
        int[] array3 = {7, 11, 23, 45, 3, 6, 4,18,15,-6};
        int value = 9;
        findSumEqualValue(array1,value);
        findSumEqualValue(array2,value);
        findSumEqualValue(array3,value);
        System.out.println("Decision with two pointers:");
        int[] array11 = {3, 4,  6,7, 11, 23, 45};
        int[] array22 = {2 , 7 , 11, 15};
        int[] array33 = {-6,3,4,6,7, 11,15, 18,23, 45 };
        twoPointers(array11,value);
        twoPointers(array22,value);
        twoPointers(array33,value);


    }
    public static void findSumEqualValue(int[] arr, int value){
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("array= "+ Arrays.toString(arr));
        System.out.println("value= " +value);
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
            if(map.containsKey(value-arr[i])){
                System.out.println("sum of:");
                System.out.println("Array element №= "+map.get((value-arr[i]))+" which is "+(value - arr[i]));
                System.out.println("+");
                System.out.println("Array element №= "+map.get((arr[i]))+" which is "+(arr[i]));
                System.out.println(("= " + value));
            }
        }
        System.out.println("map= \n"+map);
        System.out.println("----------------");
    }

    public static void twoPointers(int[] arr, int value){
        System.out.println("array= "+ Arrays.toString(arr));
        System.out.println("value= " +value);
       int left = 0;
       int right = arr.length - 1;
        int result= 0;
        while(left < right) {
            result = arr[left] + arr[right];
            if(result == value) {
                System.out.println("sum of:");
                System.out.println("Array element №= "+left+" which is "+( arr[left]));
                System.out.println("+");
                System.out.println("Array element №= "+right+" which is "+(arr[right]));
                System.out.println(("= " + value));
                System.out.println("----------------");
                break;
            }else {
                if (result > value) {
                    right--;
                } else {
                    left++;
                }
            }
        }
    }
}
