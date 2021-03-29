package Lecture1;

public class GeneralMultiThreading {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new  Runner("Thread 1"));
        thread1.start();

        Thread thread2 = new MyThread("Thread 2");
        thread2.start();

    }


}
class Runner implements Runnable {
    private String name;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(this.name + ", i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(super.getName() + ", i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}