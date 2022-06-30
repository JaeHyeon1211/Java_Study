package com.test.exam02;

abstract class SalesPlan{
    public void companyGoal(){
        System.out.println("2022년 전체 ");
    }
    abstract public void departGoal();
    abstract public void product();
}

class ATeam extends SalesPlan{
    public void manager(){
        System.out.println("A팀 팀장 : 김영희");
    }
    public void departGoal(){
        System.out.println("A팀 전체 목표 70억 달성!!");
    }
    public void product(){
        System.out.println("A팀 주력 상품은 TV 입니다.");
    }
}
class BTeam extends SalesPlan{
    public void manager(){
        System.out.println("B팀 팀장 : 이철수");
    }
    public void product(){
        System.out.println("B팀 주력 상품은 냉장고 입니다.");
    }
    public void departGoal(){
        System.out.println("B팀 전체 목표 100억 달성!!");
    }
    
}


public class Overriding {
    public static void main(String[] args) {
        ATeam ATeamSalesPlan = new ATeam();
        ATeamSalesPlan.manager();
        ATeamSalesPlan.companyGoal();
        ATeamSalesPlan.departGoal();
        ATeamSalesPlan.departGoal();
        ATeamSalesPlan.product();
        System.out.println(" ");

        BTeam BTeamSalesPlan = new BTeam();
        BTeamSalesPlan.manager();
        BTeamSalesPlan.companyGoal();
        BTeamSalesPlan.departGoal();
        BTeamSalesPlan.product();
        
    }
    
}
