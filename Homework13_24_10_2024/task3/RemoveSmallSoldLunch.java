package org.example.Homework13_24_10_2024.task3;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveSmallSoldLunch {
    public LinkedList<Integer> restrictListSoldLunch(LinkedList<Integer> lm){
        System.out.println("Today was sold next meals:");
        System.out.print("\taffordable meal costs 2.50 euros \thearty meal costs 4.30 euros \toctupus meal costs 8.1 " +
                "euros \n");
        System.out.print("                   \t                     "+lm);
        System.out.println("\nNow we find whether a dish is sold less than 2 times: ");
        for (Integer quon : lm){
            if(quon > 2){
                System.out.println("This dish is sold "+quon+" times, which is more than 2 times and remains on the menu.");
            }else {
                System.out.println("This dish is sold "+quon+" times, which is less than 2 times and is removed from the menu.");
            }
        }

        return lm;
    }
    public LinkedList<Integer> removeShortestSoldLunch(LinkedList<Integer> lm){
        System.out.println("Now we remove the dishq which is sold less then 2 times with Iterator:");
        Iterator<Integer> iter = lm.iterator();
        while (iter.hasNext()){
            Integer quon = iter.next();
            if(quon <= 2){
                lm.remove(quon);
            }
        }
        System.out.println("After removing the new LinkedList is:");
        System.out.println(lm);
        return lm;
    }
}
