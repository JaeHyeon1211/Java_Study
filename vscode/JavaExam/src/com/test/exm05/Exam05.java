package com.test.exm05;
//2022-03-28 복습
//이부분의 자바 객체지향의 거의 전부임 잊어버리지 말기!!


class A {

    private int a;
    private int b;
    static int c; //전역변수 생성
    // 컴파일시 코드 및 데이터 영역이 생성되고 프로그램 종료시까지 데이터가 유지됨

    A(){
        System.out.println("a class가 생성"); // 2. 이것이 실행
        aa();
    } //컴파일시 자동으로 생성(인자가 없는 생성자)
    A(int a , int b){
        this.a = a; //디스라는 명령어?를 통해서 전역변수를 생성
        this.b = b;
        c = bb(a,b);
    }
    void aa(){
        System.out.println("A class의 aa메소드"); // 4. 이것을 출력
    }
    int bb(int i, int j){
        return i+j;  //6. 1,2값을 받아 3을 넣어 보낸다
    }

}
abstract class C{ // 부모클래스
    int a;
    int b;

    void cc(){
        System.out.println("c클래스");
    }
    abstract void cc1();
}
class D extends C{  // 자식 클래스
    int d;
    int e;

    @Override //Annotation --> 컴파일러에게 요건 오버라이딩이다라고 안내 해주는 역활
    void cc(){
        System.out.println("D클래스의 오버라이딩");
    }
    @Override  //부모의 Abstract 메소드를 받아 실행부를 만들어준다.
    void cc1() {
        System.out.println("D클래스의 cc1메소드 ");
    }
    void dd(){
        System.out.println("D클래스의 dd 메소드");
        }
}

interface E{
    void ee1();
    void ee2();

}
class F implements E{

    @Override
    public void ee1() {
        System.out.println("F클래스의 ee1 메소드");        
    }

    @Override
    public void ee2() {
        System.out.println("F클래스의 ee2 메소드");        
    }    
}
class G{
    static class GG{ //내부클래스는 static으로 만들수 있음 클래스
                    // 안에 메소드를 static을 안하더라도 자동으로 static으로 사용됨
        int i = 0;
        void gg(){
            System.out.println("GG내부클래스");
        }
    }
}

public class Exam05 {
    public static void main(String[] args) {
        A a = new A(); // 1. 인자가 없는 생성자 실행을 통해서
        a.aa(); //3. Aclass의 aa 메소드로
        System.out.println(a.bb(1, 2)); //5. A class의 bbdp 1,2 상수를 보내고 리턴값을 받아 출력

        A aa = new A(3, 4); // A class의 a를 넘겨받는 두 생성자를 만듦
        System.out.println(aa.c);
        System.out.println(a.c);

        D d = new D();
        d.cc1();
        //보모 클래스에 공통된 메소드를 넣어 놓고 자식에 새로운 메소드를 넣어주면 중복사용을 줄일수 있음
        
        F f = new F();
        f.ee1();
        f.ee2();

        new A(); //A class의 인자가 없는 생성자가 실행됨

        G.GG g = new G.GG(); //내부클래스를 선언하는 것
        g.gg();
    }
}
