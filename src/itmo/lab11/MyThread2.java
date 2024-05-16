package itmo.lab11;


import java.util.concurrent.CountDownLatch;

public class MyThread2 extends Thread {

    private Counter counter;
    private CountDownLatch latch;

    public MyThread2(Counter counter, CountDownLatch latch) {
        this.counter = counter;
        this.latch = latch;

    }

    @Override
    public void run() {
        call();
    }
    public void call() {
       synchronized (counter) {

        int b = 0;
            while (b <1000) {

                counter.increment();
                b++;
            }
       latch.countDown();
       }
    }
}
