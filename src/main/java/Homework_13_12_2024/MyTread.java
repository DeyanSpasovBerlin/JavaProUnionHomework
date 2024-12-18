package Homework_13_12_2024;

import java.util.ArrayList;
import java.util.List;
public class MyTread {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        int maxNumber = 200_000;
        long start = System.currentTimeMillis();
        List<Integer> primeNumber = computeSequentially(maxNumber);
        long end = System.currentTimeMillis();
        System.out.println("Total numbers of prime: " + primeNumber.get(0));
        System.out.println("Last prime number is " + primeNumber.get(primeNumber.size() - 1));
        System.out.println(primeNumber.get(primeNumber.size() - 2)+" , " + primeNumber.get(primeNumber.size() - 3)+" , " + primeNumber.get(primeNumber.size() - 4));

        System.out.println("Time elapsed, sequentially:" + (end - start));

        start = System.currentTimeMillis();
        ArrayList<ArrayList<Integer>> result = computeParallel();
        end = System.currentTimeMillis();
        System.out.println(result.get(0) + " , " + result.get(1));
        System.out.println("Time elapsed, parallel:" + (end - start));
    }

    private static ArrayList<ArrayList<Integer>> computeParallel() {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Task runnable1 = new Task(2, 500_000);
        Task runnable2 = new Task(500_000, 660_000);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            ArrayList<Integer> result1 = (ArrayList<Integer>) runnable1.getPrimeNumber();
            thread2.join();
            ArrayList<Integer> result2 = (ArrayList<Integer>) runnable2.getPrimeNumber();

               result.add(0,result1);
               result.add(1,result2);

            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException("Error");
        }
    }


    private static class Task implements Runnable {

        int minNumber;
        int maxNumber;
        int count = 0;
        List<Integer> primeNumber;

        public Task(int minNumber, int maxNumber) {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
        }

        public int getCount() {
            return count;
        }
        public List<Integer> getPrimeNumber(){return primeNumber;}

        @Override
        public void run() {
            List<Integer> primeNumber = new ArrayList<Integer>(List.of(0));
            for (int i = minNumber; i < maxNumber; i++) {
                boolean isPrime = true;

                for (int j=2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    primeNumber.set(0,count);
                    count++;
                    primeNumber.add(i);
            }
        }
    }

    private static List<Integer> computeSequentially(int maxNumber) {
        List<Integer> primeNumber = new ArrayList<Integer>(List.of(0));
        int count = 0;
        for (int i = 2; i < maxNumber; i++) {
            boolean isPrime = true;

            for (int j=2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumber.set(0,count);
                count++;
                primeNumber.add(i);
            }
        }
        return primeNumber;
    }

}
