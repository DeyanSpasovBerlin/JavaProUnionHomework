package Homework_20_12_2024;

import Summary20_12_2024.Bridge;

import java.util.Random;

public class RunnerVariant1 implements Runnable{
   long  raceTime ;
   Bridge brid;

    public RunnerVariant1() {};
    public RunnerVariant1(int raceTime) {
        this.raceTime = raceTime;
    }

    public RunnerVariant1(Bridge brid) {
        this.brid = brid;
    }

    Random rand = new Random();

    public long getRaceTime() {
        return raceTime;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
     int time =  rand.nextInt(3000,6000);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beforBridge = System.currentTimeMillis();
        System.out.println("Before bridge " + Thread.currentThread().getName() + " run: " + (beforBridge - start));
        synchronized (brid){
            System.out.println("The runner " + Thread.currentThread().getName() + " is on the bridge for 3 sec!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time race for: " +Thread.currentThread().getName() +  ": "+ (end - start));
        raceTime =  (end - start);
    }
}
