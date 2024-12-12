package org.example.Homework13_24_10_2024.task3;

import java.util.LinkedList;
import java.util.List;

public class MainProgram {



    public static void main(String[] args) {

        PaymentCard petesCard = new PaymentCard("Pete",10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        System.out.println("**************");

        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);

        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);

        System.out.println("**************");

         change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard("Anne",7);

         wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);

        System.out.println("**************");

        System.out.println(unicafeExactum);

         annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

         wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);

        System.out.println("**************");
        PaymentCard jorgCard = new PaymentCard("Jorg",25);
        PaymentCard benCard = new PaymentCard("Ben",5);
        PaymentCard adamoCard = new PaymentCard("Adamo",9);
        PaymentCard saraCard = new PaymentCard("Sara",60);
        unicafeExactum.eatAffordably(5);
        unicafeExactum.eatAffordably(11);
        unicafeExactum.eatHeartily(benCard);
        unicafeExactum.eatHeartily(adamoCard);
        unicafeExactum.eatHeartily(saraCard);
        unicafeExactum.eatHeartily(8);
        unicafeExactum.eatOktupus(19);
        System.out.println(unicafeExactum);
        System.out.println("**************");
        LinkedList<Integer> removeShortesSoldLunch =  unicafeExactum.getSoldLunch();
        RemoveSmallSoldLunch rm = new RemoveSmallSoldLunch();
        rm.restrictListSoldLunch(removeShortesSoldLunch);
        rm.removeShortestSoldLunch(removeShortesSoldLunch);
        System.out.println("**************");
        List<PaymentCard> list = List.of(jorgCard,benCard,adamoCard,saraCard,annesCard,petesCard);
        LinkedList<PaymentCard> studCardList = new LinkedList<>(list);
        StatisticClass sc = new StatisticClass();
        PaymentCard minBalance = sc.stat1(studCardList);
        System.out.println("**************");
        LinkedList<PaymentCard> reloadStudCardList = sc.loadMinBalanceCard(studCardList,minBalance);
        System.out.println("**************");
        double averageBalance = sc.averageBalanceCard(studCardList);
        System.out.println("**************");
        sc.removeNonAverageBalanceCard(studCardList,averageBalance);

    }
}