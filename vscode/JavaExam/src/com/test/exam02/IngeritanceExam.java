package com.test.exam02;

//Fruit 부모
class Fruit{

    int color;
    int taste;
    void pop(){
        System.out.println("과일은 맛있어요");
    }
}
//Apple 자식
class Apple extends Fruit{  

    int price;
    int perfume;

    void cut(){
        System.out.println("사과를 짤라요");
    }
}
public class IngeritanceExam {

    public static void main(String[] args) {
        
        Apple apple = new Apple();

        apple.pop();
        apple.cut();
        //상속(extends)받아서 apple.할시 Fruit, Apple 클래스에 변수와 메소드가 모두 표시됨
    }
    
}
