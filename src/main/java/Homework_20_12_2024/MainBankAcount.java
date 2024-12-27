package Homework_20_12_2024;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class MainBankAcount {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = 0;

        TransferMoney transfer = new TransferMoney();
        BankAcount acountOfJohn = new BankAcount("John",100);
        System.out.println(acountOfJohn);
        BankAcount acountOfRichord = new BankAcount("Richard",120);
        System.out.println(acountOfRichord);
        System.out.println("-------------------------");
        while (i++ <5){
            int a = rand.nextInt(20);
            transfer.transferFromAtoB(acountOfJohn,acountOfRichord,a,i);
             a = rand.nextInt(25);
            transfer.transferFromAtoB(acountOfRichord,acountOfJohn,a,i);
        }
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(acountOfJohn);
        System.out.println(acountOfRichord);
    }
}
