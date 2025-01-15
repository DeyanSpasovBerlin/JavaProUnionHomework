package Homework_2025_01_09.Bank;

public class BankAccount {
    private int accountA;
    private int accountB;

    public BankAccount(int accountA, int accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
    }

    public synchronized int getAccountA() {
        return accountA;
    }

    public synchronized void setAccountA(int accountA) {
        this.accountA = accountA;
    }

    public synchronized int getAccountB() {
        return accountB;
    }

    public synchronized void setAccountB(int accountB) {
        this.accountB = accountB;
    }
}
