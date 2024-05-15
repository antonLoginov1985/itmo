package itmo.lab11;

import itmo.lab6.Truck;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //lessons 1,2
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            System.out.println("Состояние потока " + myThread.getName() + " перед запуском " + myThread.getState());
            myThread.start();
            System.out.println("Состояние потока " + myThread.getName() + " после выполнения  " + myThread.getState());
        }



        //lessons 3 решение 2 через latch
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(100);
        System.out.println(counter.getCount());
        for (int a = 0; a < 100; a++) {
            MyThread2 myThread2 = new MyThread2(counter, latch);
            myThread2.start();
        }
        latch.await();
        System.out.println(counter.getCount());


        //lessons 4
        Object lock = new Object();
        MyThread3 myThread41 = new MyThread3(lock);
        MyThread3 myThread42 = new MyThread3(lock);
        myThread41.start();
        myThread42.start();
    }
}


