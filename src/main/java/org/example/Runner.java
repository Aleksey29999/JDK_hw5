package org.example;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.currentThread;

public class Runner implements Runnable {
    static AtomicInteger count = new AtomicInteger(3);
    int count1 = 3;

    @Override
    public void run() {
//        double count1 = count.doubleValue();
        try {
            for (int i = 0; i < count.doubleValue(); i++) {
                System.out.println("Приступаем к обеду " + currentThread().getName());
                Thread.sleep(500);
                System.out.println("Начали размышлять " + currentThread().getName());
                Thread.sleep(500);
                System.out.println("Закончили размышлять " + currentThread().getName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}

