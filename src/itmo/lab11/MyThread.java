package itmo.lab11;

public class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;

        while (i <= 100){
            System.out.println("i = " + i + " в потоке " + getName() + "Состояние потока "+ getState());
            i++;

        }

    }
}
