package com.test.exam02;

class Animal{
    public void move(){System.out.println("동물은 움직입니다.");}
    public void leg(){System.out.println("동물은 다리가 있습니다.");}
}

class Human extends Animal{
    public void move(){System.out.println("사람이 두발로 걷습니다.");}
    public void leg(){System.out.println("사람은 다리가 2개 입니다.");}

}

class Tigger extends Animal{
    public void move(){System.out.println("호랑이는 네 발로 뜁니다.");}
    public void leg(){System.out.println("호랑이는 다리가 4개 입니다.");}
}

class Eagle extends Animal{
    public void move(){System.out.println("독수리는 날개로 하늘을 납니다,");}
    public void leg(){System.out.println("독수리는 다리가 2개 입니다.");}
}

public class AnimalTest1 {
    public static void main(String[] args) {
        AnimalTest1 aTest1 = new AnimalTest1(); 

        aTest1.moveAnimal(new Human());
        aTest1.moveAnimal(new Tigger());
        aTest1.moveAnimal(new Eagle());
        aTest1.legAnimal(new Human());
        aTest1.legAnimal(new Tigger());
        aTest1.legAnimal(new Eagle());

        System.out.println("\n");
        Animal animal1 = new Animal();
        animal1.move();

    }
   
    public void moveAnimal(Animal animal){
        animal.move();
    }
    public void legAnimal(Animal animal){
        animal.leg();
    }
    
}
