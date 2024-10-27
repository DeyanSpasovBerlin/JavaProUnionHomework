package org.example.Homework13_24_10_2024.task3;

import java.util.Iterator;
import java.util.LinkedList;

public class StatisticClass {

    public PaymentCard stat1(LinkedList<PaymentCard> l){
        PaymentCard bufer = new PaymentCard(l.getFirst().balance());
        for (PaymentCard a : l){
            if(a.balance() < bufer.balance()){
                bufer = a;
            }
        }
        System.out.println("We have next paymentcard:\n");
        System.out.print("\t"+l);
        System.out.println("\nNow we will find the paymentcard with min money balance.\nThis card is:");
        System.out.println(bufer);
        return bufer;
    }
    public LinkedList<PaymentCard> loadMinBalanceCard(LinkedList<PaymentCard> l, PaymentCard pc){
        System.out.println("Initial link of cards:\n");
        System.out.print("\t"+l);
        PaymentTerminal payRer = new PaymentTerminal();
        double bufer = 0.0;
        for (PaymentCard a : l){
             bufer = a.balance()*0.1;
            payRer.addMoneyToCard(pc,bufer);
            a.takeMoney(bufer);
            bufer = 0.0;
        }
        System.out.println("Now we will load min balance card with 10% of balance from all card.\nAfter loading new " +
                "link is:");
        System.out.println(l);
        return l;
    }

    public Double averageBalanceCard(LinkedList<PaymentCard> l){
        double averageBalance = 0.0;
        double bufer = 0.0;
        int nunMember = l.size();
        for ( PaymentCard a : l){
            bufer += a.balance();
        }
        averageBalance = bufer/nunMember;
        System.out.println("Average balance in students card is: "+averageBalance);
        return averageBalance;
    }

    public LinkedList<PaymentCard> removeNonAverageBalanceCard(LinkedList<PaymentCard> l,double average){
        LinkedList<PaymentCard> outOfAverageCard = new LinkedList<>();
        Iterator<PaymentCard> iter = l.iterator();

        while (iter.hasNext()){
            PaymentCard bufer = iter.next();
            if(bufer.balance() < (average-20) || bufer.balance() > (average+20)){
                outOfAverageCard.add(bufer);
               iter.remove();
            }
        }
        System.out.println("Now we will find all students card which balance is not in interval from "+average+"-20 " +
                "and "+average+"+20, mean not in interval "+(average-20)+" and "+(average+20)+".");
        System.out.println("\t"+outOfAverageCard);
        System.out.println("\nWe will remove all card out this interval. The new link is:\n");
        System.out.print("\t"+l);
        return l;
    }
}
