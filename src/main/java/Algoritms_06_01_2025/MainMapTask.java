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


        int[] array4 = {0, 0, 1, 1, 1, 2 , 2, 3, 3, 4};
        int[] res = noDuble(array4);
        System.out.println(Arrays.toString(res));


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


        int[] array = {-4, -4, 0, 3, 10};
        int[] result = sortedSquares(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));



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

    public static int[] sortedSquares(int[] arr) {
        int index = arr.length - 1;
        int [] sortArr = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;
        while (index >= 0) {

            if (arr[left]*arr[left] > arr[right]*arr[right] ) {
                sortArr[index] = arr[left]*arr[left];
                left++;
            } else {
                sortArr[index] = arr[right]*arr[right];
                right--;
            }
            index--;
        }
        return sortArr;
    }

    public static int[] noDuble(int[] arr) {
        int first = 0;
        int second = 1;
        for(second =1; second < arr.length; second++){
            if(arr[first] != arr[second]){
                arr[first+1] = arr[second];
                first++;
            }
        }
        return arr;
    }

}
//[-4, -2 , 0 , 3, 10]
//
// [16,4,0,9,100] -> [0, 4, 9, 16, 100]
// 1) Пробежаться по всему массиву и возвести каждое число в квадрат O(n)
// 2) Отсортировать массив O(n logn)
//    O(n) + O(n logn) = O(nlogn)
//
//1) Создать результирующий массив такой же длины как и оригинальный
//2) Сделать левый и правый указатель , левый с индекса 0 , правый с length -1
//3) Создать текущий индекс для результирующего массива length -1
//4) Запустить цикл пока текущий индекс >=0
//5) В каждой итерации цикла мы возводим в квадрат элемент по левому и правому
//индексу, сравниваем их между собой и если больше квадрат правого числа, то
//записываем по текущему индексу в результирующий массив , квадрат правого числа
//уменьшаем индекс правый на 1. Если же квадрат левого числа больше , то его записываем
//по текущему индексу и увеличиваем левый индекс 1
//6) Уменьшаем текущий индекс на 1
//7) Заканчиваем эту итерацию цикла

//index = 0;
//for(int i = 0; i < arr.length ; i++) {
//    int temp = arr[i]; // 0, 0
//    for(int j = i + 1; j < arr.length; j++) {
//        if(temp != arr[j]) {
//           result[index++] = temp;
//           i = j;
//           break;
//        }
//    }
//}

//1) first = 0;
//2) second = 1 to < arr.length
//3) Внутри цикла сравниваем элемент по первому и второму указателю
//Если они не равны, то на место первого указателя +1 , записываем элемент из
//второго указателя
//И увеличиваем первый указатель, а второй увеличится , так как это цикл
//
//[0, 0, 1, 1, 1, 2 , 2, 3, 3, 4]