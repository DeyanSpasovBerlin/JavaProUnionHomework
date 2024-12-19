package Homework_17_12_2024;

import java.util.ArrayList;
import java.util.List;

public class MyTread implements Runnable{
    int minNumber;
    int maxNumber;
    int count = 0;
    ArrayList<Integer> primeNumber = new ArrayList<>();

    public MyTread() {
    }

    public MyTread(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.primeNumber =  primeNumber;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public ArrayList<Integer> getPrimeNumber() {
        return primeNumber;
    }

    public ArrayList<Integer> computeSequentially(int maxNumber) {
        ArrayList<Integer> primeNumber = new ArrayList<Integer>(List.of(0));
        int count = 0;
        for (int i = 2; i < maxNumber; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumber.set(0, count);
                count++;
                primeNumber.add(i);
            }
        }
        return primeNumber;
    }

    public void printLast5PrimeNum(ArrayList<Integer> primeNumber) {
        for (int i = primeNumber.size() - 2; i > primeNumber.size() - 7; i--) {
            System.out.println("The prime number №  " + i + " is: " + primeNumber.get(i));
        }
    }

    @Override
    public void run() {
            for (int i = minNumber; i < maxNumber; i++) {
                boolean isPrime = true;

                for (int j=2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    count++;
                    primeNumber.add(i);
                }
            }
    }

    public ArrayList<Integer> computeParallel() {
        ArrayList<Integer> result = new ArrayList<>();
        MyTread myNewTread1 = new MyTread(2, 150000);
        MyTread myNewTread2 = new MyTread(150001, 200000);

        Thread thread1 = new Thread(myNewTread1);
        Thread thread2 = new Thread(myNewTread2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            ArrayList<Integer> primeNumber1 = myNewTread1.getPrimeNumber();
            int res1 = myNewTread1.getCount();
            thread2.join();
            int res2 = myNewTread2.getCount();
            ArrayList<Integer> primeNumber2 = myNewTread2.getPrimeNumber();
            int count = res1 + res2;
            result.add(0,count);
            result.addAll(primeNumber1);
            result.addAll(primeNumber2);
            System.out.println("Total numbers of prime: " + count);
            for (int i = primeNumber1.size() - 1; i > primeNumber1.size() - 6; i--) {
                System.out.println("The last 5 prime number from thread1  :  " + i + " is: " + primeNumber1.get(i));
            }
            System.out.println("-----------");
            for (int i = primeNumber2.size() - 1; i > primeNumber2.size() - 6; i--) {
                System.out.println("The last 5 prime number from thread2  :  " + i + " is: " + primeNumber2.get(i));
            }
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException("Error");
        }
    }
}
