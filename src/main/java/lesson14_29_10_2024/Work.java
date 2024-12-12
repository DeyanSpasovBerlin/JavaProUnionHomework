package org.example.lesson14_29_10_2024;

import java.util.ArrayList;
import java.util.LinkedList;



public class Work {
    public int searc(ArrayList<String> list, String key) {
        int index = -1;
        int endtIndex = list.size() - 1;
        int startIndex = 0;
        while (startIndex <= endtIndex) {
            int midleSize =startIndex +  (endtIndex - startIndex) / 2;
            if (key.compareTo( list.get(midleSize))>0){
                startIndex = midleSize + 1;
            } else if (key.compareTo(list.get(midleSize)) < 0) {
                endtIndex = midleSize - 1;
            } else {
                index = midleSize;
                System.out.println(index);
                return index;
            }
        }
        System.out.println(index);
        return index;
    }
}

