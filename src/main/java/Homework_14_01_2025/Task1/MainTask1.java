package Homework_14_01_2025.Task1;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MainTask1 {
    public static void main(String[] args) throws InterruptedException {

        int count = 1;
        ExecutorService tenBrigades = Executors.newFixedThreadPool(10);
        AtomicInteger i= new AtomicInteger(1);
        AtomicInteger j= new AtomicInteger(0);
        Callable<String> bildHaus = () -> {
            System.out.println(Thread.currentThread().getName() + " bilding HausComplex "+i+" haus № "+j);
            Thread.sleep(2_000);
            j.getAndIncrement();
            return "Haus № "+j+" in complex № "+i+" is ready. It is bildet from " + Thread.currentThread().getName();
        };

        while (count<5) {
            List<Future<String>> futures = tenBrigades.invokeAll(List.of(
                    bildHaus, bildHaus, bildHaus, bildHaus, bildHaus,
                    bildHaus, bildHaus, bildHaus, bildHaus, bildHaus));

            futures.forEach(f -> {
                try {
                    System.out.println(f.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });
            i.getAndIncrement();
            count++;
            Thread.sleep(2_000);
        }

        tenBrigades.shutdown();






    }

}
