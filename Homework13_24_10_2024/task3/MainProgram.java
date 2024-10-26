package org.example.Homework13_24_10_2024.task3;

import java.util.LinkedList;

public class MainProgram {



    public static void main(String[] args) {

        PaymentCard petesCard = new PaymentCard(10);

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

        PaymentCard annesCard = new PaymentCard(7);

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
        PaymentCard jorgCard = new PaymentCard(25);
        PaymentCard benCard = new PaymentCard(5);
        PaymentCard adamoCard = new PaymentCard(9);
        PaymentCard saraCard = new PaymentCard(60);
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

    }
}