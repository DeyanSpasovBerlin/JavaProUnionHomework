package AlgoritmsResum;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[]arr1 ={-4, -2 , 0 , 3, 10};
        int[]arr2 ={1,2,3,6,8,13,22};
        int[]arr3 ={1,2,2,2,4,5,8,8,9};
        int[]arr4 ={0, 0, 1, 1, 1, 2 , 2, 3, 3, 4};
        int[]arr5 ={5,1,2,1,2};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(sortedSquares(arr1)));
        System.out.println("---------------");
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(sortedSquares(arr2)));
        System.out.println("---------------");
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(sortedSquares(arr3)));
        System.out.println("---------------");

        char[] helloy = {'H', 'e' , 'l', 'l', 'o'};
        System.out.println(Arrays.toString(helloy));
        System.out.println(Arrays.toString(reversArray(helloy)));
        System.out.println("---------------");

        System.out.println(Arrays.toString(arr4));
//        System.out.println(Arrays.toString(truncateDuplicate(arr4)));
        System.out.println("Non duplicate arr up to index: "+truncateDuplicate(arr4));
        System.out.println(Arrays.toString(arr4));
        System.out.println("---------------");

        System.out.println(Arrays.toString(arr5));
        System.out.println("Single element in arr5 is: "+singleElement(arr5));
        System.out.println("---------------");
    }
        public static int[] sortedSquares ( int[] arr){
            int index = arr.length - 1;
            int[] sortArr = new int[arr.length];
            int left = 0;
            int right = arr.length - 1;
            while (index >= 0) {
                int lsqr = arr[left] * arr[left];
                int rsqr = arr[right] * arr[right];
                if (lsqr > rsqr) {
                    sortArr[index] = lsqr;
                    left++;
                } else {
                    sortArr[index] = rsqr;
                    right--;
                }
                index--;
            }
            return sortArr;
        }

        public static char[] reversArray(char[] arr){
            int l = 0;
            int r = arr.length - 1;
            while(l < r) {
                char temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp; }
            return arr;
        }

        public static /*int[]*/int truncateDuplicate(int[] arr){
            int first = 0;
            for(int second = 1 ; second < arr.length; second++) {
                if(arr[first] != arr[second]) {
                    arr[first + 1] = arr[second];
                    first++;
                }
            }
            return first ;
//            return arr;
        }

        public static int singleElement(int[] arr){
            int sum = 0;
            for(int element : arr) {
                sum = sum ^ element;
            }
            return sum;
        }
}

