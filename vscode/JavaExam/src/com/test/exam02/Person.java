package com.test.exam02;
//같은 패키지로 그룹화 해줌

public class Person {
    //Person으로 캡슐화
    //stack안에 클래스 변수명(Person)을 저장
   
    /* 전역변수에 초기값이 있는 상태
    String name;
    int age = 23;
    String gender;*/
    
    /*
    //전역변수에 초기값이 없는 상태
    String name;
    int age;
    String gender;
    //속성을 전역변수로 만들기
    */

     //getter, setter는 Private
     private String name;
     private int age = 23;
     private String gender;

    /* 아래처럼 따로 정의하면 기본생성자 생략 가능
    //전역변수에 초기값이 있는 상태
    public Person(){}
    기본 생성자(디폴트)
    public Person(String name){
        this.name = name;
        //this 현재의 클래스의 전역변수에 있는 name을 말함
    }
    public Person(int age, String gender){
        this.age = age;
        this.gender = gender;
    }
    */
   
    /* 아래처럼 한번에 정의하면 기본생성자(디폴트)를 생성해줘야 함
    // 전역변수에 초기값이 없는 상태
    public Person(){}
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    */

    //getter 메소드
    //get-> private으로 정의한 전역변수를 불러온다
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;

    }

    //setter메소드
    public void setName(String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void setGender (String gender){
        this.gender = gender;
    }


    public void smile(){System.out.println("웃어요");}
    public void ager(){System.out.println("화내지마세요");} 
    //methomd 만들기
}
