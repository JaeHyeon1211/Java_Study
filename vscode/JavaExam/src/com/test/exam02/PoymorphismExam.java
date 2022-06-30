package com.test.exam02;

class Family{

    void hello(){
        //System.out.println("인사합시다.");
     }

    void dinner() {
        System.out.println("저녁식사.");
    }

    void fishing() {
        //System.out.println("낚시할래.");
    }
}

class kimfamily extends Family {
    void hello(){
        System.out.println("김선생님 안녕하세요");
    }
    void dinner(){
        System.out.println("저녁 식사한번 하시죠?");
    }
    void drink(){
        System.out.println("술 한잔하시죠..");
    }
}
class parkfamily extends Family{
    void hello(){
        System.out.println("박선생님 안녕하세요");
    
    }
    void dinner(){
        System.out.println("점심 식사한번 하시죠?");
    }
    void fishing(){
        System.out.println("낚시나 같이 하시죠..");
    }
}



public class PoymorphismExam {

    /*
    public static void main(String[] args) {
        
        Family kFamily = new kimfamily();
        kFamily.dinner();

        Family pFamily = new parkfamily();
        pFamily.fishing();

        Family family = new Family();
        family.hello();
       
        kimfamily kim = new kimfamily();
        kim.hello();
        */
        public static void main(String[] args) {
            PoymorphismExam test = new PoymorphismExam();
            test.comunn(new kimfamily());
            test.comunn(new parkfamily());
        }


            public void comunn(Family select) {
                select.hello();
                select.dinner();
                select.fishing();
            }
        
}

    
    


