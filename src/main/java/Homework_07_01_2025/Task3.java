package Homework_07_01_2025;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Task3 {

//3.Реализовать модель кафе: один повар и много посетителей. Посетители посещают кафе со случайной периодичностью.
//    Каждого посетителя представить как отдельный поток. Повар готовит пиццу, кладет ее на прилавок (в блокирующую очередь).
//    При наличии трех готовых пицц повар отдыхает.
//            один посетитель (отдельный поток)
//        - заходит в кафе
//        - ждет пиццу на прилавке
//        - ест пиццу
//        - покидает кафе
//    повар (отдельный поток)
//        - готовит пиццу
//        - кладет ее на прилавок (в блокирующую очередь)
//        - отдыхает, если готовых пицц уже 3 шт.

    static BlockingQueue<String> orderQueue = new ArrayBlockingQueue<>(8);
    static BlockingQueue<String> cookedDishesQueue = new ArrayBlockingQueue<>(3);

    public static void main(String[] args) {
        CustomReentrantLockArrayBlockingQueue queue = new CustomReentrantLockArrayBlockingQueue(5);
        new Thread(new ChefCook(queue), "Cook").start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i = 1;
        List<String> dishes = List.of("Pizza", "Peperoni", "Margerita", "Kalzone", "Vegetariana");
        while (true) {
            new Thread(new Visitor(queue,dishes.get(new Random().nextInt(dishes.size()))), "Visitor " + i++).start();
            try {
                Thread.sleep(2000 + new Random().nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    static class Visitor implements Runnable {
        private CustomReentrantLockArrayBlockingQueue queue;

        String meal;

        public Visitor(String meal) {
            this.meal = meal;
        }

        public Visitor(CustomReentrantLockArrayBlockingQueue queue, String meal) {
            this.queue = queue;
            this.meal = meal;
        }

        @Override
        public void run() {
           try {
                System.out.println(Thread.currentThread().getName() + " enters cafe");
                System.out.println(Thread.currentThread().getName() + " makes order");
                orderQueue.put(meal);
                System.out.println(Thread.currentThread().getName() + " waits for the order");
               Thread.sleep(7000);
               System.out.println("Queue Visitor orders size: " + orderQueue.size());
               String cookedMeal =cookedDishesQueue.take();
                System.out.println(Thread.currentThread().getName() + " enjoys " + cookedMeal);
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " leaves cafe");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ChefCook implements Runnable {
        private CustomReentrantLockArrayBlockingQueue queue;

        public ChefCook() {
        }

        public ChefCook(CustomReentrantLockArrayBlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {

            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting for visitor");
                    String order = orderQueue.take();
//                    String order = queue.take();
                    System.out.println(Thread.currentThread().getName() + " cooking " + order);
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " brings order to visitor");
//                    cookedDishesQueue.put(order);
//                    System.out.println("Bislang getoastete Pizzen: " + cookedDishesQueue.size());
                    cookedDishesQueue.put(order);
                    System.out.println("Queue ready Pizza size: " + cookedDishesQueue.size());
                    if(cookedDishesQueue.size() == 3){
                        System.out.println("--------------");
                        System.out.println("The Chef back 3 Pizz and now rest for 1 sec!");
                        System.out.println("--------------");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
