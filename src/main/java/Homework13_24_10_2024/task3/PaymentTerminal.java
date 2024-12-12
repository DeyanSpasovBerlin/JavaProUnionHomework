package org.example.Homework13_24_10_2024.task3;

import java.util.LinkedList;

public class PaymentTerminal {
    private double money;  // amount of cash
    public int affordableMeals; // number of sold affordable meals
    public int heartyMeals;// number of sold hearty meals
    public int octupusMeals;// number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = money + 1000.0;
        this.affordableMeals = affordableMeals;
        this.heartyMeals = heartyMeals;
        this.octupusMeals = octupusMeals;
    }

    public double eatAffordably(double payment) {
        double change=0.0;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        if (payment >= 2.5){
            money = money + 2.5;
            change = payment - 2.5;
            affordableMeals++;
            return change;
        }else {
            System.out.println("Yor balance is not enought for this lunch!");
            change = payment;
        }
        return change;
    }

    public double eatHeartily(double payment) {
        double change=0.0;
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.3){
            money = money + 4.3;
            change = payment - 4.3;
            heartyMeals++;
            return change;
        }else {
            System.out.println("Yor balance is not enought for this lunch!");
            change = payment;
        }
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() >= 2.5){
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        }else {
            System.out.println("Yor balance is not enought for this lunch!");
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() >= 4.3){
            card.takeMoney(4.3);
            heartyMeals++;
            return true;
        }else {
            System.out.println("Yor balance is not enought for this lunch!");
            return false;
        }
    }

    public double eatOktupus(double payment) {
        double change=0.0;
        // a octupus meal costs 8.1 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 8.1){
            money = money + 8.1;
            change = payment - 8.1;
            octupusMeals++;
            return change;
        }else {
            System.out.println("Yor balance is not enought for this lunch!");
            change = payment;
        }
        return change;
    }

    public boolean eatOktupus(PaymentCard card) {
        // an octupus meal costs 8.1) euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() >= 8.1){
            card.takeMoney(8.1);
            octupusMeals++;
            return true;
        }else {
            System.out.println("Yor balance is not enought for this lunch!");
            return false;
        }
    }
    public LinkedList<Integer> getSoldLunch(){
        LinkedList<Integer> lm = new LinkedList<>();
        lm.add(affordableMeals);
        lm.add(heartyMeals);
        lm.add(octupusMeals);
        return lm;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }


    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals+
                ", number of sold Oktupus meals: " + octupusMeals;
    }
}
