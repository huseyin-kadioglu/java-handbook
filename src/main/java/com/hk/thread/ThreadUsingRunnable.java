package com.hk.thread;

public class ThreadUsingRunnable implements Runnable{
    private int threadNumber;

    public ThreadUsingRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
