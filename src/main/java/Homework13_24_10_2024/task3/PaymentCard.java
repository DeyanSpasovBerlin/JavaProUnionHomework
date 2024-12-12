package org.example.Homework13_24_10_2024.task3;

public class PaymentCard {
    private String name;
    private double balance;
    public PaymentCard(){};
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    public PaymentCard(String name,double balance){
        this.name = name;
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
        if(this.balance >= amount){
            balance =  balance - amount;
            return true;
        }else {
            System.out.println("Your balanc is not enought for this lunch!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "PaymentCard{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
