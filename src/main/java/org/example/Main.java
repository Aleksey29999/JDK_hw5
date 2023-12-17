package org.example;
//Есть пять философов (потоки), которые могут либо обедать либо размышлять.
//        Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
//        После каждого приема пищи философ должен размышлять
//        Не должно возникнуть общей блокировки
//        Философы не должны есть больше одного раза подряд

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.currentThread;

public class Main {
    //    static Boolean dinner;
    Object dinner = new Object();
    Object think = new Object();
    static AtomicInteger count = new AtomicInteger(3);

    public static void main(String[] args) throws InterruptedException {


        Thread philosopher1 = new Thread(new Runner());
        Thread philosopher2 = new Thread(new Runner());
        Thread philosopher3 = new Thread(new Runner());
        Thread philosopher4 = new Thread(new Runner());
        Thread philosopher5 = new Thread(new Runner());
//        philosopher1.setDaemon(true);
//        philosopher2.setDaemon(true);
//        philosopher3.setDaemon(true);
//        philosopher4.setDaemon(true);
//        philosopher5.setDaemon(true);
        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();


    }
    }



//import java.util.Random;
//import java.util.concurrent.CountDownLatch;
//
//import static java.lang.Thread.currentThread;
//
//public class Main {
//           public static void main(String[] args) throws InterruptedException {
//            CountDownLatch dinner = new CountDownLatch(3);
//            CountDownLatch think = new CountDownLatch(1);
//            Thread philosopher1 = new Thread(new Runner(dinner, think));
//            Thread philosopher2 = new Thread(new Runner(dinner, think));
//            Thread philosopher3 = new Thread(new Runner(dinner, think));
//            Thread philosopher4 = new Thread(new Runner(dinner, think));
//            Thread philosopher5 = new Thread(new Runner(dinner, think));
//               philosopher1.start();
//               philosopher2.start();
//               philosopher3.start();
//               philosopher4.start();
//               philosopher5.start();
//            System.out.println("Приготовились к обеду");
//               dinner.await();
//               think.countDown();
//               philosopher1.join();
//               philosopher2.join();
//               philosopher3.join();
//               philosopher4.join();
//               philosopher5.join();
//            System.out.println("Пора спать!");
//
//        }
//
//        static class Runner implements Runnable {
//            private CountDownLatch ToDinner;
//            private CountDownLatch ToThink;
//
//            public Runner(CountDownLatch ToDinner, CountDownLatch ToThink) {
//                this.ToDinner = ToDinner;
//                this.ToThink = ToThink;
//            }
//
//            @Override
//            public void run() {
//
//                System.out.println("Приступаем к обеду " + currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                    ToDinner.countDown();
//                    ToThink.await();
//                    System.out.println("Закончили обедать " + currentThread().getName());
//                    Thread.sleep(500);
//                    System.out.println("Закончили размышлять " + currentThread().getName());
//
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//        }


//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}

