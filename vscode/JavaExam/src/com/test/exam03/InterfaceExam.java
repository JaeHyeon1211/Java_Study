package com.test.exam03;
//abstract와 인터페이스의 차이 
//일반 클래스를 만들어서 상속받은 클래스들이 메소드를 사용 할 수 있음
//부모클래스에서 abstract로 받은 매소드는 무조건 자식클래스의 메소드에서 실행부를 만들어야함
//abstract 일반 클래스를 만들어서 하기 때문에 일반 클래스안에 실행부를 만들 수 있음
//com.test.exam02 > Overriding.java

interface Sales {  //실행부가 없는 매소드를 만듦
    public void manage();
    public void goal();
    public void product();
}
class ATeam implements Sales{ //부모인터페이스에서 만들어놓은 메소드를 실행부를 만듦
    @Override
    public void manage() {
        System.out.println("A팀장입니다.");        
    }
    @Override
    public void goal() {
        System.out.println("ATeam은 올해 70억을 달성하겠습니다.");
    }
    @Override
    public void product() {
        System.out.println("ATeam의 주력 상품이 TV입니다.");        
    }
}
class BTeam implements Sales{
    @Override
    public void manage() {
        System.out.println("B팀장입니다.");      
    }
    @Override
    public void goal() {
        System.out.println("BTeam은 올해 100억을 달성하겠습니다.");
    }
    @Override
    public void product() {
        System.out.println("BTeam의 주력 상품이 냉장고입니다.");        
    }
}
public class InterfaceExam {
    public static void main(String[] args) {
        ATeam aSalePlan = new ATeam();
        aSalePlan.manage();
        aSalePlan.goal();
        aSalePlan.product();

        System.out.println(); 
        
        BTeam bSalePlan = new BTeam();
        bSalePlan.manage();
        bSalePlan.goal();
        bSalePlan.product();
        
    }
}
