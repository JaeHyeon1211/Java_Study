package com.test.thread;
//자바는 다중 상속이 안됨
//인터페이스는 다중 상속이 가능함

class ExamClass2 extends Thread{
    @Override
    public void run(){
        try {
            for(int i = 0; i<30; i++){
                Thread.sleep(1000);
                System.out.println("Thread1 실행");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}

public class ThreadExam2 {
    
    public static void main(String[] args) {
        ExamClass2 examClass2 = new ExamClass2();
        examClass2.start();   
        for(int i = 0; i<30; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread2 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
         
    }
}
