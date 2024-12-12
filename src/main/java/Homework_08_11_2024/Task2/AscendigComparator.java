package org.example.Homework_08_11_2024.Task2;

import java.util.Comparator;
import java.util.Map;

public class AscendigComparator implements Comparator<Object> {
     private     Map<String,Integer> map;

    public AscendigComparator(Map<String, Integer> map) {
        this.map = map;
    }




    @Override
    public int compare(Object o1, Object o2) {
        if(map.get(o1) == map.get(o2)){
            return 1;
        }else {
            return ((Integer)map.get(o1).compareTo((Integer) map.get(o2)));
        }
    }
}
