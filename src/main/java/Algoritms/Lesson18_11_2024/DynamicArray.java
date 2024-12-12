package org.example.Algoritms.Lesson18_11_2024;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray {
    private int[] array = new int[1];
    private  int count = 0;
    private  int size = 1;

    public DynamicArray() {}

    public DynamicArray(int[] array, int count, int size) {
        this.array = new int[1];
        this.count = count;
        this.size = size;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                ", count=" + (count-1) +
                ", size=" + size +
                '}';
    }

    public int[] addElement(int el){
        if(count == size) {
            resizeArray();
        }
        this.array[count] = el;
        count++ ;
        return array;
    }

    public int[]  resizeArray(){
        if(!Objects.equals(this.array[size - 1],null)){
            int[] arrayNew = new int[size*2];
            this.size = size*2;
            arrayNew = Arrays.copyOf(array,size);
            array = arrayNew;
        }
        return array;
    }

    public int[] remove() {
        if(count == 0){
            System.out.println("The array is empty!");
        }else{
            this.array[count-1] = 0;
            count--;
        }
        return array;
    }

}



/*
*
add(data) - добавляет данные в конец массива
//можно просто добавить и иногда нужно увеличить массив и потом добавить

remove() - удаляет последний элемент

growSize() - увеличивает массив в 1.5 раза, перекопировать элементы
старого массива в новый, и заменить старый массив в переменной array на новый
 */

/*
public DynamicArray() {

this.array = new int[1];
count = 0;
size = 1;

}
class DynamicArray {

 constructor() {
        this.array = new Array(1);
        this.count = 0;
        this.size = 1;
 }
}
 */
/*
Learning Recursion, Alvin J. Alexander    8-10 глава - сартировка слияние
 */

