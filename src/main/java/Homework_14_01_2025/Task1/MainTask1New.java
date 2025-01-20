package Homework_14_01_2025.Task1;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MainTask1New {

    public static void main(String[] args) throws InterruptedException {

        int countHause = 1;
        int countComplex = 1;

        AtomicInteger i = new AtomicInteger(1);
        AtomicInteger j = new AtomicInteger(1);
        Callable<String> bildHaus = () -> {
            System.out.println(Thread.currentThread().getName() + " bilding HausComplex " + i + " haus № " + j);
            Thread.sleep(2_000);
            j.getAndIncrement();
            return "Haus № " + j + " in complex № " + i + " is ready. It is bildet from " + Thread.currentThread().getName();
        };



            try (ExecutorService singleBrigade = Executors.newSingleThreadExecutor()) {
                while (countComplex < 4) {
                while (countHause < 11) {
                    Future<String> future = singleBrigade.submit(bildHaus);
                    try {
                        String result = future.get(); // main thread waiting for the result from threadpool
                        System.out.println(result);
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    countHause++;
                    Thread.sleep(1000);
                }
            }
            j.getAndIncrement();
            countComplex++;
        }
    }


}




