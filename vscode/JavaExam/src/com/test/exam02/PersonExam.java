package com.test.exam02;
//같은 패키지로 그룹화 해줌

public class PersonExam {
    public static void main(String[] args) {

        /* 전역변수에 초기값이 정해져있는 상태
        //Hoap에 Person을 참조
        Person person = new Person();
        //클래스 클래스변수   생성자 매개변수값이 비어있음
        //클래스를 인스턴스화
        //Person으로 캡슐화
        person.age = 50;
        System.out.println(person.age);
        //클래스안에 전역변수를 이용해서 출력
    
        person.smile();
        Person person1 = new Person();
        System.out.println(person1.age);
        */ 

        /* 전역변수에 초기값이 없는 상태
        //Person 클래스에 메소드를 정의해서 매개변수에 값을 넣어서 초기화하기
        Person person = new Person("김철수");
        System.out.println(person.name);

        Person p1 = new Person(23, "male");
        System.out.println(p1.age + p1.gender);
        */
        Person person = new Person();

        String name = " 김철수";
        int age = 45;
        String gerder = "male";

        person.setName(name);
        System.out.println(person.getName());

        person.setAge(age);
        System.out.println(person.getAge());

        person.setGender(gerder);
        System.out.println(person.getGender());
    }
    
}
