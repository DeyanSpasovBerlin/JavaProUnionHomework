package Homework_07_01_2025;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {
    Scanner reader = new Scanner(System.in);
    boolean shouldStop = false;
    static AtomicInteger counter1 = new AtomicInteger(0);
    private int arrows = 10;
    static BlockingQueue<Integer> robinHoodQueue = new SynchronousQueue<>(true);
    static BlockingQueue<Integer> servanQueue = new SynchronousQueue<>(true);

     public void fire() {

        while (!shouldStop) {
            try{
                for (int idx = arrows; idx >= 0; idx--) {
                    if (idx != 0) {
                        System.out.println("The arrow is " + (arrows - idx + 1) + " right on the target!");
                        counter1.incrementAndGet();
                    } else {
                        System.out.println("The arrows are over");
                        System.out.println("--------------");
                        System.out.println("Enter how many arrows Robin Hood ordered:");
                        System.out.println("--------------");
                        arrows = reader.nextInt();
                            System.out.println("Carry a new quiver with " + arrows + " arrows!!");
                            servanQueue.put(arrows);
                    }
                    System.out.println("RobinHood stretches the bow with the new arrow 1 sec!");
                    Thread.sleep(1000);
                }
                System.out.println("So far Robin Hood has fired: "+counter1.get());
                arrows = robinHoodQueue.take();
                System.out.println("RobinHood take new deliveru from " + arrows + " arrows!");
                if(counter1.get()>20){
                    System.out.println("--------------");
                    System.out.println("Robin Hood shoots 20 and goes for a beer!");
                    System.out.println("--------------");
                    shouldStop = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

     }

    // reload() brings new arrows, calls the notify() method, which awakens the thread
     public void reload() {
         while (!shouldStop) {
             System.out.println(Thread.currentThread().getName() + " waiting for command!");
             try {
                 arrows = servanQueue.take();
                 System.out.println("New " + arrows + " arrows on the way!");
                 System.out.println(Thread.currentThread().getName() + " delivered " + arrows + " arrows.");
                 Thread.sleep(2000);
                 System.out.println(Thread.currentThread().getName() + " brings order to RobinHood for 2 sec.");
                 robinHoodQueue.put(arrows);
                 if(counter1.get()>20){
                     System.out.println("--------------");
                     System.out.println("The squire brought more than 20 arrows. He knows " +
                             "that after 20 arrows Robin Hood will be drinking beer. The squire lay down to sleep.");
                     System.out.println("--------------");
                     shouldStop = true;
                 }
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }

    public static void main(String[] args) {

        Task1 crossbow = new Task1();

        Thread robinHood = new Thread(crossbow::fire,"RobinHood");
        Thread servant = new Thread(crossbow::reload,"Squire");
            robinHood.start();
            servant.start();
    }
}

