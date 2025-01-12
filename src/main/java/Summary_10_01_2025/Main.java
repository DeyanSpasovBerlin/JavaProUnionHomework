package Summary_10_01_2025;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<CarBody> fullCarBody = new ArrayBlockingQueue<>(3,true);
        BlockingQueue<Wheel> fullCarWheel = new ArrayBlockingQueue<>(9,true);
        BlockingQueue<Car> fullCar = new ArrayBlockingQueue<>(3,true);
        Thread body =new Thread(() ->{
            while (true) {
                try {
                    System.out.println("Now we make body!");
                    fullCarBody.put(new CarBody());
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"bodyMaker");

        Thread wheel =new Thread(() ->{
            while (true) {
                try {
                    System.out.println("Now we make whee!");
                    fullCarWheel.put(new Wheel());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"wheelMaker");

        Thread readyCar =new Thread(() ->{

            while (true) {
                try {
                    System.out.println("Now we make Car!");
                    CarBody e = fullCarBody.take();
                    ArrayList<Wheel> listWheel1= new ArrayList<>(4);
                    for (int i =0; i<4;i++){
                         listWheel1.add(fullCarWheel.take());
                    }
                    Car c = new Car(e,listWheel1);
                    fullCar.put(c);
                    System.out.println(fullCar.size());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"readyCar");

        body.start();
        wheel.start();
        readyCar.start();
    }
}
