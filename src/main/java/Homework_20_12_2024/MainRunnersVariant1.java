package Homework_20_12_2024;

import Summary20_12_2024.Bridge;
import Summary20_12_2024.Runner;

import java.util.ArrayList;

public class MainRunnersVariant1 {
    public static void main(String[] args)  {
        Bridge bridge = new Bridge();

        RunnerVariant1 run1 = new RunnerVariant1(bridge);
        Thread threadRun1 = new Thread(run1,"runner1");
        threadRun1.start();


        RunnerVariant1 run2 = new RunnerVariant1(bridge);
        Thread threadRun2 = new Thread(run2,"runner2");
        threadRun2.start();


        RunnerVariant1 run3 = new RunnerVariant1(bridge);
        Thread threadRun3 = new Thread(run3,"runner3");
        threadRun3.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long time1 = run1.getRaceTime();
        long time2 = run2.getRaceTime();
        long time3 = run3.getRaceTime();
        ArrayList<Long>  times = new ArrayList<Long>();
        times.add(time1);
        times.add(time2);
        times.add(time3);
        times.sort(Long::compareTo);
        System.out.println("The race times with 3 sec on the bridge are: "+times);
    }
}
