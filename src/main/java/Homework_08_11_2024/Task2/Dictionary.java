package org.example.Homework_08_11_2024.Task2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Dictionary {
    private String[] textString;

    public Dictionary(String[] textString) {
        this.textString = textString;
    }

    public String[] getTextString() {
        return textString;
    }


    @Override
    public String toString() {
        return "Dictionary{" +
               "textString=" + Arrays.toString(textString) +
               '}';
    }
    public Map<String,Integer> getMapText() {
        Map<String, Integer> dictMap = new HashMap<>();
        Integer bufer = 0;
        for (String str : textString){
            if(dictMap.containsKey(str)){
                bufer = dictMap.get(str)+1;
                dictMap.put(str,bufer);
            }else {
                dictMap.put(str,1);
            }
        }
        return dictMap;
    }
    public void sortMapWiyhMethodAscendig(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> textWords = new ArrayList<>(map.entrySet());;
        textWords.sort(Map.Entry.comparingByValue());
        AtomicInteger i = new AtomicInteger(1);
        textWords.forEach(word -> System.out.println("\tword №:"+(i.getAndIncrement())+" ["+word.getKey()+"] is " +
            "written ["+word.getValue()+
                "] " +
                "times."));
    }
    public void sortMapWiyhMethodDescendig(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> textWords = new ArrayList<>(map.entrySet());
        Collections.sort(textWords, new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> map1,Map.Entry<String,Integer> map2){
                return (map2.getValue()).compareTo(map1.getValue());
            }
        });
        HashMap<String,Integer> sortedDescendingTextWords = new LinkedHashMap<String,Integer>();
        for (Map.Entry<String,Integer> word  : textWords){
            sortedDescendingTextWords.put(word.getKey(),word.getValue());
        }
        AtomicInteger i = new AtomicInteger(1);
        sortedDescendingTextWords.forEach((word,ocuranceNum) -> System.out.println("\tword №:"+(i.getAndIncrement())+" ["+word+"] is written ["
                +ocuranceNum+"] times."));

    }
    public void sortWithAscenComparatorClass(Map<String,Integer> map){
        Map<String,Integer> sortCompClass = new TreeMap<>(new AscendigComparator(map));
        sortCompClass.putAll(map);
        AtomicInteger i = new AtomicInteger(1);
        sortCompClass.forEach((word,ocuranceNum) -> System.out.println("\tword №:"+(i.getAndIncrement())+" ["+word+"] is written ["
                +ocuranceNum+"] times."));
    }
    public void sortWithDescenComparatorClass(Map<String,Integer> map){
        Map<String,Integer> sortDesCompClass = new TreeMap<>(new DescendingComparator(map));
        sortDesCompClass.putAll(map);
        AtomicInteger i = new AtomicInteger(1);
        sortDesCompClass.forEach((word,ocuranceNum) -> System.out.println("\tword №:"+(i.getAndIncrement())+" ["+word+"] is written ["
                +ocuranceNum+"] times."));
    }

}
