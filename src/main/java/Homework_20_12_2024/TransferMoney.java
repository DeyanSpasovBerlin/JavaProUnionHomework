package Homework_20_12_2024;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class TransferMoney {
    int transfer;
    BankAcount bankAcount;
    TransferRecords tranRec;


    public TransferMoney() {
    }

    public TransferMoney(BankAcount bankAcount, int transfer) {
        this.bankAcount = bankAcount;
        this.transfer = transfer;
        this.tranRec = tranRec;
    }

    public void transferFromAtoB(BankAcount A, BankAcount B, int sum, int i, TransferRecords tr){
        Thread t = new Thread(() ->{
            synchronized (B){
                if(sum<A.getBalance()) {
                    int balancABefor = A.getBalance();
                    int balancBBefor = B.getBalance();
                    B.setBalance(B.getBalance() + sum);
                    A.setBalance(A.getBalance()-sum);
                    System.out.println(A.name+" Transfer № " + i +": from "+A.name+ " to "+B.name+ " at " + LocalDateTime.now());
                    System.out.println(("From BankAcount " + A.name + " transfer €" + sum +
                            " to bankAcount " + B.name + " in time: " + LocalDateTime.now()));
                    System.out.println("Balanc of acount " + A.name + " befor transfer was: " + balancABefor+" €");
                    System.out.println("Balanc of acount " + A.name + " after transfer is: " + A.getBalance()+" €");
                    System.out.println("Balanc of acount " + B.name + " befor transfer was: " + balancBBefor+" €");
                    System.out.println("Balanc of acount " + B.name + " after transfer is: " + B.getBalance()+" €");
                    System.out.println("-------------------------");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("In bancAcount " + A.name + " not enought mone for transfer sum: " + sum+" €");
                }
            }
        });
        t.start();
        try {
            t.join();
            System.out.println(A+" at: "+LocalDateTime.now());
            System.out.println(B+" at: "+LocalDateTime.now());
            System.out.println("***");
            System.out.println("Sum of balance of " + A.name + " + sum of balance of "
                    + B.name + " = " + (A.getBalance() + B.getBalance())+" €");
            System.out.println("***");
            System.out.println("================");
            tr.getMap().put(("Transfer № "+tr.count+" from "+A.name+" to "+B.name+" €. "),sum);
            tr.count++;
            System.out.println("All transfer up to: " + LocalDateTime.now());
            for (Map.Entry<String,Integer> entry : tr.getMap().entrySet()){
                System.out.println(entry.getKey() + " € " + entry.getValue());
            }
            System.out.println("================");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
