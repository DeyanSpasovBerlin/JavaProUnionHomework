package Homework_06_12_2024;

public class Main_06_12_2024 {
    public static void main(String[] args) {
        Start start = new Homework_06_12_2024.Start();
        start.start();

//        int count = 0;
//        for (int i = 2; i < 1000000; i++) {
//            boolean isPrime = true;
//            for (int j=2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime)
//                count++;
//        }
//        System.out.println("Total numbers of prime: " + count);
    }
}
/*
public class ThreadExNew2 {
    static int sum1 = 0;
    static int sum2 = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            ThreadEx threadEx = new ThreadEx();
            List<Integer> list = threadEx.generateList();
            for (int i = 0; i < list.size() / 2; i++) {
                sum1 += list.get(i);
            }
        });

        Thread t2 = new Thread(() -> {
            ThreadEx threadEx = new ThreadEx();
            List<Integer> list = threadEx.generateList();
            for (int i = list.size() / 2; i < list.size(); i++) {
                sum2 += list.get(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(ThreadExNew2.sum1 + ThreadExNew2.sum2);
    }
}
 */