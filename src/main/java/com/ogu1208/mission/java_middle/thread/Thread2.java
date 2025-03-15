package com.ogu1208.mission.java_middle.thread;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread2 running...");

            try {
                /* 스레드를 일시 정지 시키는 메소드 */
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
