package Homework_08_11_2024.Task2;

import Homework_08_11_2024.Task2.Dictionary;
import Homework_08_11_2024.Task2.TextContein;
import Homework_08_11_2024.Task2.GenerateStringList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class MainTask2 {
    public static void main(String[] args) {
        TextContein txt = new TextContein();
        String text = txt.getText();
        System.out.println("We have the next start text:");
        System.out.println("--------------");
        System.out.println(text);
        System.out.println("--------------");
        GenerateStringList generList = new GenerateStringList();
        String[] txtList = generList.makeStringArr(text);
        System.out.println("We have the next start list of words:");
        System.out.println("--------------");
        System.out.println(Arrays.toString(txtList));
        System.out.println("--------------");
        Dictionary dict = new Dictionary(txtList);
        Map<String,Integer> dictMap = dict.getMapText();
        System.out.println("From this list of words we make HashMap word -> number of ocurance in text:");
        System.out.println("--------------");
        System.out.println(dictMap);
        System.out.println("--------------");
        System.out.println("First we will sort this HashMap in ascending order with methods " +
                "comparingByValue() ");
        System.out.println("--------------");
        dict.sortMapWiyhMethodAscendig(dictMap);
        System.out.println("--------------");
        System.out.println("Second we will sort this HashMap in descending order with Comparator<Map.Entry<String," +
                "Integer>> and will stored data in new LinkedHashMap<String, Integer> ");
        System.out.println("--------------");
        dict.sortMapWiyhMethodDescendig(dictMap);
        System.out.println("--------------");
        System.out.println("Now we will write 2 new claces  Comparator class of Object type. In every Comparator we " +
                "will put map as its instance variable ");
        System.out.println("--------------");
        dict.sortWithAscenComparatorClass(dictMap);
        System.out.println("--------------");
        System.out.println("Now we will descending sort with class DescendingComparator: ");
        System.out.println("--------------");
        dict.sortWithDescenComparatorClass(dictMap);

    }
}
