package com.test.exam01;

class ErrorTest{

    public void errormaking()throws ArithmeticException{
                             //메소드를 통해 예외처리 클래스를 적어 놓는거임
        int a = 4/0;
        System.out.println("a = " + a);

    }
}
class FoolException extends Exception{}  
//Excetion이라는 예외처리 클래스로부터 상속을 받는다

public class ExceptionExam {

    public void sayNickname(String nickname){

        if(nickname.equals("fool"))
         //nickname이 fool과 같다는 조건문에서
            try {
                throw new FoolException(); //강제적을 예외를 실행시키는 부분
            } catch (FoolException e) {
               
                System.err.println("FoolException이 발생했습니다.");
            }  
        //사용자가 직접 Exception을 만드는 구조
       
        System.out.println("당신의 별명은 "+ nickname + "입니다.");
    }


public static void main(String[] args) {
    
    int c;
    //trym catch finally
    try{
        c =4/0;
    }catch(ArithmeticException e){ //e는 변수
        c = -1;//예외 발생시 조치할 부분

    }finally { //c =4/0부분에서 예외가 발생하더라도 실행시켜야 할 부분
        System.out.println("다행이다...");
    }

    System.out.println("c = "+ c);

    //Thorw
    //ErrorTest errorTest = new ErrorTest(); //static이 아니라서 인스턴스화 시켜줌
    //errorTest.errormaking();

    ExceptionExam exam = new ExceptionExam();
    //exam.sayNickname("fool");   
    exam.sayNickname("genious");   
}
}