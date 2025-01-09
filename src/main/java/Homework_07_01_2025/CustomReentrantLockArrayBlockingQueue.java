package Homework_07_01_2025;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class CustomReentrantLockArrayBlockingQueue {

    private int maxCapacity;


    private Queue<String> queue = new ArrayDeque<>(maxCapacity);

    private ReentrantLock lock = new ReentrantLock(true);
    private Condition queueIsNotEmpty = lock.newCondition();
    private Condition queueIsNotFull = lock.newCondition();

    public CustomReentrantLockArrayBlockingQueue(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    public void put(String data) {
        lock.lock();
        try {
            if (queue.size() == maxCapacity) {
                queueIsNotFull.awaitUninterruptibly();
            }
            queue.add(data);
            queueIsNotEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public String take() {
        lock.lock();
        try {
            if (queue.isEmpty()) {
                queueIsNotEmpty.awaitUninterruptibly();
            }
            queueIsNotFull.signal();
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        lock.lock();
        try {
           return queue.size();
        } finally {
            lock.unlock();
        }
    }

}
