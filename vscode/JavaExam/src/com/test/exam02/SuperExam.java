package com.test.exam02;

class Point{
    
    int x = 10;
    int y = 20;

    Point(int x, int y){ //자식클래스에서 가져온 x, y값이 존재
        this.x = x; //this로 하여 부모의 값(x)을 자식클래스가 가져갈수 있음
        this.y = y;
        
    }
}

class Point3D extends Point{

    int z = 30;

    Point3D() { //this로 키워드?지시어?한다
        this(100, 200, 300); //Ponint 3D int x, y, z에 100, 200, 300값을 넣어줌
     }
    Point3D(int x, int y, int z){
        super(x,y);//자식클래스의 x, y값을 부모클래스의 x, y에 삽입
        this.z = z;//부모클래스의 값을 다 가져온후 자신클래스의 값도 챙김
    }
}

public class SuperExam {
    public static void main(String[] args) {
        Point3D point3d = new Point3D(); //new Point3D 생성자가 point3d로 인스턴스화하고 
        System.out.println("Point3D의 x, y, z = " 
        + point3d.x + " "+ point3d.y + " " + point3d.z);

    }

}
