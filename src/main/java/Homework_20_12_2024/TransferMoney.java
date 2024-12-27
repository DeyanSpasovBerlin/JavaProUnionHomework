package Homework_20_12_2024;

import java.time.LocalDateTime;
import java.util.Date;

public class TransferMoney {
    int transfer;
    BankAcount bankAcount;

    public TransferMoney() {
    }

    public TransferMoney(BankAcount bankAcount, int transfer) {
        this.bankAcount = bankAcount;
        this.transfer = transfer;
    }

    public  void transferFromAtoB(BankAcount A,BankAcount B,int sum,int i){
        new Thread(() ->{
            synchronized (B){
                if(sum<A.getBalance()) {
                    int balancABefor = A.getBalance();
                    int balancBBefor = B.getBalance();
                    B.setBalance(B.getBalance() + sum);
                    A.setBalance(A.getBalance()-sum);
                    System.out.println("Transfer № " + i +" from "+A.name+ " to "+B.name+ " at " + LocalDateTime.now());
                    System.out.println(("From BankAcount " + A.name + " transfer " + sum +
                            " to bankAcount" + B.name + " in time: " + LocalDateTime.now()));
                    System.out.println("Balanc of acount " + A.name + " befor transfer was: " + balancABefor);
                    System.out.println(("Balanc of acount " + A.name + " after transfer is: " + A.getBalance()));
                    System.out.println("Balanc of acount " + B.name + " befor transfer was: " + balancBBefor);
                    System.out.println(("Balanc of acount " + B.name + " after transfer is: " + B.getBalance()));
                    System.out.println("-------------------------");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("In bancAcount " + A.name + " not enought mone for transfer sum: " + sum);
                }

            }
        }).start();
    }
}
