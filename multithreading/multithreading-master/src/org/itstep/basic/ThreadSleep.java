package org.itstep.basic;

public class ThreadSleep extends Thread{

    String[] messages = {
            "If you can keep your head when all about you",
            "Are losing theirs and blaming it on you,",
            "If you can trust yourself when all men doubt you,",
            "But make allowance for their doubting too;",
            "If you can wait and not be tired by waiting,",
            "Or being lied about, don’t deal in lies,",
            "Or being hated, don’t give way to hating,",
            "And yet don’t look too good, nor talk too wise."};
    public static void main(String[] args) throws InterruptedException {
        (new ThreadSleep()).start();
        for (int i=0; i<10; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        for (String s : messages){
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
