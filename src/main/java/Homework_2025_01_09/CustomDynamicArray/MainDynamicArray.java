package Homework_2025_01_09.CustomDynamicArray;

import Homework_07_01_2025.CustomReentrantLockArrayBlockingQueue;

import java.util.Random;

public class MainDynamicArray {
 public   static Boolean shuldStop = false;

    public static void main(String[] args) {
        CustomDynamicArray queue = new CustomDynamicArray(5);
        new Thread(new Producer(queue), "Producer").start();
        new Thread(new Consumer(queue), "Consumer").start();
    }


    static class Producer implements Runnable {
        Random rand = new Random();
        String data = "";
        private CustomDynamicArray queue;
        int i = 0;
        public Producer(CustomDynamicArray queue) {
            this.queue = queue;
        }
        int stop =rand.nextInt(20);
        public void whenStop(){
            System.out.println("Comand Exit will be after: "+(stop-1));
        }
        @Override
        public void run() {
            whenStop();
            while (!shuldStop) {

                if(stop == i){
                         data = "Exit";
                    }else {
                         data = "Data from " + Thread.currentThread().getName() + " " + i;
                    }
                    System.out.println("Generating №: "+i+"  " + data);
                    queue.add(Integer.parseInt(data));
                    i++;
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                }
                if(shuldStop){
                    System.out.println("Producer stop work by command from Consumer!");
                    break;
                }
            }
        }
    }

    static class Consumer implements Runnable {


        private CustomDynamicArray queue;

        public Consumer(CustomDynamicArray queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (!shuldStop) {
                System.out.println("Queue size: " + queue.size());
                String taken =queue.take();
                if(taken.equals("Exit")){
                    System.out.println("Consumer stop work by command Exit!");
                    shuldStop = true;
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " working with: " + taken);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }




}
