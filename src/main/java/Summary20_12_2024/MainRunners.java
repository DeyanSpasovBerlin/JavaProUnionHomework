package Summary20_12_2024;

import java.util.ArrayList;

public class MainRunners {
    public static void main(String[] args)  {
        Bridge bridge = new Bridge();

    Runner run1 = new Runner(bridge);
    Thread threadRun1 = new Thread(run1,"runner1");
        threadRun1.start();


        Runner run2 = new Runner(bridge);
        Thread threadRun2 = new Thread(run2,"runner2");
        threadRun2.start();


        Runner run3 = new Runner(bridge);
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
