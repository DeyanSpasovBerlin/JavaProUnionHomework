package org.example.Homework13_24_10_2024.task4;

import java.util.*;

public class Task4 {
   private List<Integer>  data = Arrays.asList(1, 4, 3, 2, 1, 2, 2, 0);
   private LinkedList<Integer> list = new LinkedList<Integer>(data);
   public void getIndex(Integer arg){
       LinkedList<Integer> indList = new LinkedList<Integer>();
       Integer bufer=0;
       for (Integer intIndex : list){
           if(intIndex.equals(arg)){
               indList.add(bufer);
           }
           bufer++;
       }
       System.out.println("We have the next LinkedList:");
       System.out.println(list);
       if(indList.size() == 0){
           System.out.println("The number "+arg+" not present in this link!");
       }else {
           System.out.println("The number " + arg + " is appears " + indList.size() + " times in this LinkedList.");
           System.out.println("The number " + arg + " appears in the following positions:");
           System.out.println(indList);
           System.out.println("For the first time " + arg + " appears in the :" + indList.getFirst() + "  position.");
           System.out.println("For the last time " + arg + " appears in the :" + indList.getLast() + "  position.");
       }
   }
    public void getIndexIterator(Integer arg){
        LinkedList<Integer> indList = new LinkedList<Integer>();
        Integer bufer=0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            if(iter.next().equals(arg)){
                indList.add(bufer);
            }
            bufer++;
        }
        System.out.println("Now we will do the same with Iterator:");
        System.out.println(list);
        if(indList.size() == 0){
            System.out.println("The number "+arg+" not present in this link!");
        }else {
            System.out.println("The number " + arg + " is appears " + indList.size() + " times in this LinkedList.");
            System.out.println("The number " + arg + " appears in the following positions:");
            System.out.println(indList);
            System.out.println("For the first time " + arg + " appears in the :" + indList.getFirst() + "  position.");
            System.out.println("For the last time " + arg + " appears in the :" + indList.getLast() + "  position.");
        }
    }

}
