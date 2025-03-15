package com.ogu1208.mission.java_middle.thread;

/**
 * 두 개의 스레드를 생성하고, 각 스레드에서 고유의 작업을 수행하도록 구현합니다.
 * 두 개의 스레드가 동시에 실행되는 것을 확인합니다.
 * 결과물로 두 개의 스레드가 동시에 실행되는 것을 보여주는 스크린샷을 제출합니다.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread(new Thread2());

        thread1.start();
        thread2.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Main is running...");

            try {
                /* 스레드를 일시 정지 시키는 메소드 */
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
