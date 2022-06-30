package com.test.thread;

public class ThreadExam3 {
    public static void main(String[] args) {
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i =0; i<10; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread1 실행");
                }
             
            }
            
        }).start();;
        for(int i = 0; i< 10; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread2 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
    
}
