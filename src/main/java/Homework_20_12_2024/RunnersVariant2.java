package Homework_20_12_2024;

import java.util.Random;

public class RunnersVariant2 {
    Long time = (long) 0.0;
    String name;
    Bridge brid;

    public RunnersVariant2(String name, Bridge brid) {
        this.name = name;
        this.brid = brid;
    }

    public long getTime() {
        return time;
    }
    public String getName() {
        return name;
    }

    Random rand = new Random();

    public Thread runRunners() {
        new Thread(() -> {
            Long startTime = System.currentTimeMillis();
            System.out.println("startTime for "+Thread.currentThread().getName()+": " + startTime);
            int randTime =  rand.nextInt(3000, 6000);
            try {
                Thread.sleep(randTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Long timeBeforBridge = System.currentTimeMillis();
            System.out.println("Befor bridge " + Thread.currentThread().getName() + " run: " + (timeBeforBridge - startTime));
            synchronized (brid){
                System.out.println("The runner " + Thread.currentThread().getName() + " is on the bridge for 3 sec!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Long endTime = System.currentTimeMillis();
            System.out.println("endTime for "+Thread.currentThread().getName()+": "  + endTime);
            Long diffTime = endTime - startTime;
            this.time = diffTime;
            System.out.println("raceTime for: "+Thread.currentThread().getName()+" "+diffTime);
            System.out.println("randTime for: "+Thread.currentThread().getName()+" "+randTime);
        },this.name).start();
        return Thread.currentThread();
    }
}


//1. Спортивное соревнование. Бегут 3 бегуна. Каждый пробегает дистанцию за случайное время.
//Каждый бегун земеряет свой результат и сообщает его тренеру. В конце забега выводится информация о победителе.
//Реализовать данную модель с помощью запуска отдельных потоков. Бегуна представить через класс Runner implements Runnable.
//1. Доработать задачу 1 summary session от 2024.12.20:
//Добавить в логику бега на соревнованиях мост. Бегуны перебегают через него только по одному, остальные ждут своей очереди.