package Homework_20_12_2024;

import java.util.ArrayList;
import java.util.TreeMap;

public class BankAcount {
    int balance;
    String name;

//    TreeMap<String, ArrayList<Integer>> map = new TreeMap<>();

    public BankAcount(String name, int balanc) {
        this.name = name;
        this.balance = balanc;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

//    public TreeMap<String, ArrayList<Integer>> getMap() {
//        return map;
//    }




    @Override
    public String toString() {
        return "BankAcount{" +
                "balance=" + balance +
                " €, name='" + name + '\'' +
                '}';
    }
}
