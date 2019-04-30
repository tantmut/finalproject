package concurrency;

import sun.awt.windows.ThemeReader;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }

    private void someMethod() {
        throw new RuntimeException();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
