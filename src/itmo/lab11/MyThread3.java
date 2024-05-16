package itmo.lab11;

public class MyThread3 extends Thread {

    private Object lock;

    public MyThread3(Object lock) {
       this.lock = lock;
    }

    @Override
    public void run() {
        while (1 == 1) {

            synchronized (lock) {
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}