package org.example.Homework15_29_10_2024.task2;

import java.util.*;

public class MainTask2 {
    public static void main(String[] args) {
        MasterCard mc1 = new MasterCard(123456);
        MasterCard mc2 = new MasterCard(234567);
        MasterCard mc3 = new MasterCard(82556);
        MasterCard mc4 = new MasterCard(931456);
        Visa  vs1= new Visa(123456);
        Visa  vs2= new Visa(7891256);
        Visa  vs3= new Visa(954456);
        Visa  vs4= new Visa(832456);

        Card card1 = new Card(mc1,vs4);
        Card card2 = new Card(mc4,vs1);
        Card card3 = new Card(mc2,vs3);
        Card card4 = new Card(mc1,vs2);
        Card card5 = new Card(mc3,vs3);
        Card card6 = new Card(mc4,vs4);

        SortedSet<Card> set = new TreeSet<>( new Card.MasterIdComparator());
        set.add(card1);
        set.add(card2);
        set.add(card3);
        set.add(card4);
        set.add(card5);
        set.add(card6);

        System.out.println(" The sorted  tree by MasterCard is:");
        for (Card c : set){
            System.out.print("\t"+c);
        }
        System.out.println("\n**************");
        SortedSet<Card> set1 = new TreeSet<>( new Card.MasterIdComparator());
        set1 = (TreeSet<Card>) set;

        System.out.println(" The sorted  tree by VisaCard is:");
        for (Card c : set1){
            System.out.print("\t"+c);
        }
    }
}
