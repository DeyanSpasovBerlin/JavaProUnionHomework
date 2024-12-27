package Homework_20_12_2024;

public class BankAcount {
    int balance;
    String name;

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

    @Override
    public String toString() {
        return "BankAcount{" +
                "balance=" + balance +
                " €, name='" + name + '\'' +
                '}';
    }
}
