package Homework_17_12_2024;

public class FromLesson {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        int maxNumber = 200_000;
        long start = System.currentTimeMillis();
        int count = computeSequentially(maxNumber);
        long end = System.currentTimeMillis();
        System.out.println("Total numbers of prime: " + count);
        System.out.println("Time elapsed, sequentially:" + (end - start));

        start = System.currentTimeMillis();
        count = computeParallel();
        end = System.currentTimeMillis();
        System.out.println("Total numbers of prime: " + count);
        System.out.println("Time elapsed, parallel:" + (end - start));
    }

    private static int computeParallel() {
        Task runnable1 = new Task(2, 150_000);
        Task runnable2 = new Task(150_000, 200_000);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            int result1 = runnable1.getCount();
            thread2.join();
            int result2 = runnable2.getCount();
            int count = result1 + result2;
            return count;
        } catch (InterruptedException e) {
            throw new RuntimeException("Error");
        }
    }


    private static class Task implements Runnable {

        int minNumber;
        int maxNumber;
        int count = 0;

        public Task(int minNumber, int maxNumber) {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
        }

        public int getCount() {
            return count;
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

                if (isPrime)
                    count++;
            }
        }
    }

    private static int computeSequentially(int maxNumber) {
        int count = 0;
        for (int i = 2; i < maxNumber; i++) {
            boolean isPrime = true;

            for (int j=2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                count++;
        }
        return count;
    }
}
