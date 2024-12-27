package Homework_20_12_2024;

import java.util.ArrayList;

public class MainRunnersVariant2 {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        RunnersVariant2 run1 =new RunnersVariant2("Runner1",bridge);
        RunnersVariant2 run2 =new RunnersVariant2("Runner2",bridge);
        RunnersVariant2 run3 =new RunnersVariant2("Runner3",bridge);

        run3.runRunners();
        run1.runRunners();
        run2.runRunners();



        ArrayList<Long> times = new ArrayList<Long>();

        try {
            Thread.sleep(14000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("run1.getTime: "+run1.getTime());
        System.out.println("run2.getTime: "+run2.getTime());
        System.out.println("run3.getTime: "+run3.getTime());
        times.add(run1.getTime());
        times.add(run2.getTime());
        times.add(run3.getTime());
        System.out.println("The race times with 3 sec on the bridge are: "+times);
        times.sort(Long::compareTo);
        System.out.println("The sorted race times with 3 sec on the bridge are: "+times);
    }
}
