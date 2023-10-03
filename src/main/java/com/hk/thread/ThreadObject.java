package com.hk.thread;

public class ThreadObject extends Thread {

    // Threadleri kullanmanın iki yolu var;
    // 1- extends Thread
    // 2- implements Runnable

    /*
    Peki hangisi daha avantajlı?
    Runnable kullanırsam Thread nesnesi yaratıp içine benim runnable objeyi vermem gerekir. Öte yandan Thread kullanırsam extends thread yapmam gerekir ve
    başka objeyi miras alamam. Runnable burada bana hareket kabiliyeti sunuyor. Bana kalırsa onu kullanmak daha mantıklı. (JAVADA ÇOKLU MİRAS YOK)
     */

    private int threadNumber;

    public ThreadObject(int threadNumber) {
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
