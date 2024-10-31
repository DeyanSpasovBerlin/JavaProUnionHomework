package org.example.lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hometask {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(1,4,3,2,2,2,2,2,2,2,2,2,0,9,15,8));
        Integer key = 2;
        List<Integer> firstAndLast = findFirstAndLast(list, key);
        System.out.println(firstAndLast);

    }

    public static List<Integer> findFirstAndLast(LinkedList<Integer> list, Integer key) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        Iterator<Integer> iterator = list.iterator();
        Integer buferPrev = list.getFirst();
        if(buferPrev.equals(key)){
            result.add(index);
        }else{
            while (iterator.hasNext()){
                Integer bufer = iterator.next();
                if (bufer.equals(key) && !bufer.equals(buferPrev)) {
                    result.add(index);
                    buferPrev = bufer;
                } else if (!bufer.equals(key) && buferPrev.equals(key)) {
                    result.add(index);
                    break;
                }else {
                    index++;
                }
            }
        }
        return result;
    }


}
