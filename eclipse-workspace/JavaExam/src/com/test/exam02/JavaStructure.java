package com.test.exam02;  //패키지는 자바 파일의 최상단에 작성

import java.util.Scanner; // 외부 패키지로부터 클래스를 가져온다

public class JavaStructure {
			//파일명과 class이름이 같아야함
	public static int sum(int a, int b) {
		
		return a+b;
		
	}

	public static void main(String[] args) {  //main method 시작
        // stack      main method가 호출하는 method역시 static
		/*(public)*/int i =10;
		//생락가능 ->변수 a를 integer형(4byte=32bit)으로 선언
		//       ->변수가 담을 데이터가 저장될 메모리의 시작 주소를 가르키는 포인터
		// 처음에 선언할때 값을 넣는거랑 선언후 나중에 값을 넣는것의 차이는?
		// 참조변수(클래스?)설명할대 할 예정
		long l_value = 10L;
		double d_value = 10;
		float f_value = 10;
		
		System.out.println("Integer i = " + i + "\n" + "long type l_value = " + l_value);
		System.out.println("double d_value = "+d_value+"\n"+"float f_value = "+f_value);
		
		String[] names = new String[3];
		//배열 선언         new예약어=new연산자
		int size = names.length;
		
		//값입력받기 참조형
		Scanner put = new Scanner(System.in);
		//클래스 클래스변수=인스턴스 클래스()=>생성자  
		 	//->stack에 put이라는 메모리에 위치에 있지만 값은 Heap에 저장되어있음
		
		for(int index = 0; index<size; index++) {
			
			System.out.println("이름을 입력하세요 : ");
			names[index] = put.nextLine();
			
		}
		//입력받는값 화면에 출력
		for(int index =0; index<size; index++)
			System.out.println("이름 : "+ names[index]);
		
		put.close();	
		
	}

}
