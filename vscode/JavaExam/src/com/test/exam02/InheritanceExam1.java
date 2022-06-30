package com.test.exam02;
//2022-03-24 23일자 수업 복습

class Par{
    //생성자는 클래스의 전역 변수(멤버변수)를 초기화시킨다.
    //생성자는 클래스의 인스턴스가 생성될때 가장 먼저 실행되어
    //생성자 내에 기술된 명령문을 실행한다.
    //this.전역변수 , super.전역변수 
    //this, super -->지시어, 명령어, 예약어, 키워드등으로 불림
    Par(){
        this(1); //3번실행
        //본인 클래스에 있는 인자가 있는 생성자를 가르킨후에 다시 돌아옴
        System.out.println("인자가 없는 Parents 클래스의 생성자"); //5번실행 및 출력
        
    }//Par(){}는 이클래스에 기본 생성자
    Par(int i){ 
        System.out.println("인자가 1개인 Parents 클래스의 생성자"); //4번실행 및 출력

    }
}

class Chil extends Par{
    int c1;
    int c2;
    Chil(int c1, int c2){
        this.c1 = c2;
        this.c2 = c2;
        
    }

    Chil(){
        super(); //2번 실행
        //상속을 준 부모를 가르킨후에 다시 자식클래스로 돌아옴
        //부모 클래스의 생성자를 호출
        //Super와 this가 없이 실행시 main실행시 부모먼저 출력후 자식이 자동으로 출력됨
        System.out.println("인자가 없는 Child 클래스의 생성자"); //6번실행 및 출력
    }

}

public class InheritanceExam1 {
    public static void main(String[] args) { //엔트리포인트(시작점)
        Chil chil = new Chil(1, 2);  //1번실행
        //chil.___(); 없이 출력이 됨
        System.out.println("Child Class의 전역변수 : "+ chil.c1 + " " + chil.c2 );

    }
    
}
