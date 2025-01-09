package Homework_20_12_2024;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class RunnersVariant3 {
    Long time = (long) 0.0;
    String name;
    Bridge brid;
    RunnersRecords records;

    public RunnersVariant3(String name, Bridge brid) {
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
    public Runnable setRunnable(){
        System.out.println("----------");
        Runnable r = () ->{
            Long startTime = System.currentTimeMillis();
            System.out.println("startTime for "+Thread.currentThread().getName()+": " + startTime);
            int randTime =  rand.nextInt(3000, 6000);
            try {
                Thread.sleep(randTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Long timeBeforBridge = System.currentTimeMillis();
            System.out.println("Before bridge " + Thread.currentThread().getName() + " run: " + (timeBeforBridge - startTime));
            synchronized (brid){
                System.out.println("The runner " + Thread.currentThread().getName() + " is on the bridge for 3 sec!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Long endTime = System.currentTimeMillis();
            System.out.println("endTime for "+Thread.currentThread().getName()+": "  + endTime);
            Long diffTime = endTime - startTime;
            this.time = diffTime;
            System.out.println("raceTime for: "+Thread.currentThread().getName()+" "+diffTime);
            System.out.println("randTime for: "+Thread.currentThread().getName()+" "+randTime);
        };
        return r;
    }
    public ArrayList<Long> putRecords(RunnersVariant3 r,RunnersRecords rec){
        Thread t = new Thread(r.setRunnable(), r.getName());
        t.start();
        try {
            t.join();
            rec.recordsWrite.add(r.getTime());
            System.out.println("List: "+rec.recordsWrite);
            rec.raceRecords.put(r.getName(),r.getTime());
            System.out.println("----------");
            System.out.println("Map:");
            for (Map.Entry<String, Long> entry : rec.raceRecords.entrySet()){
                String runner = entry.getKey();
                Long raceTime = entry.getValue();
                System.out.println(runner + " : " + raceTime);
            }
            System.out.println("----------");
            return rec.recordsWrite;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


//1. Спортивное соревнование. Бегут 3 бегуна. Каждый пробегает дистанцию за случайное время.
//Каждый бегун земеряет свой результат и сообщает его тренеру. В конце забега выводится информация о победителе.
//Реализовать данную модель с помощью запуска отдельных потоков. Бегуна представить через класс Runner implements Runnable.
//1. Доработать задачу 1 summary session от 2024.12.20:
//Добавить в логику бега на соревнованиях мост. Бегуны перебегают через него только по одному, остальные ждут своей очереди.