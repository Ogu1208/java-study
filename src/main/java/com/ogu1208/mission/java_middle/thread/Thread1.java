package com.ogu1208.mission.java_middle.thread;

public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 1 is running...");

            try {
                /* 스레드를 일시 정지 시키는 메소드 */
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
