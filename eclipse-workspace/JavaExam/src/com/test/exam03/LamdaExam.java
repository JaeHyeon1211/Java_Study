package com.test.exam03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//함수형 프로그램 표기법을 하려면 람다식을 사용해야됨
@FunctionalInterface
interface MyLamdaFunction {
	int sum(int a, int b);
}
@FunctionalInterface
interface MyPrint{
	String printLamda();
	
}

public class LamdaExam {
	public static void main(String[] args) {
		MyLamdaFunction lamdaFunction = (int a, int b) -> a+b;
		System.out.println(lamdaFunction.sum(3, 4));
		
		MyPrint myPrint = () -> "Hello World 1";
		System.out.println(myPrint.printLamda());
		
		//Supplier : 매개변수 없이 반환값만을 갖는 함수형 인터페이스
		Supplier<String> supplier = () -> "Hello World 2";
		System.out.println(supplier.get());
		
		//Consumer : 객체 T를 매개변수로 받아서 사용. 변환값이 없는 함수형 인터페이스
		Consumer<String>consumer = (str)->System.out.println(str.split(" ")[0]);
		consumer.andThen(System.out::println).accept("Hello World 3");
		
		//Function : 객체 T를 매개변수로 받아서 처리한 후 R로 반환하는 함수형 인터페이스
		Function<String, Integer> function = str->str.length();
		System.out.println(function.apply("Hello World"));
		
		//Predicate : 객체 T를 매개변수로 받아서 처리한 후 Boolean을 반환
		Predicate<String> predicate = (str)->str.equals("Hello World 4");
		System.out.println(predicate.test("Hi world"));
		System.out.println(predicate.test("Hello World 4"));
		
		//일반 참조형, 메소드 참조형, 생성자 참조형..
		
		Function<String, Integer> function2 = String::length;
		System.out.println(function2.apply("Hello World"));
		
		Consumer<String> consumer2 = System.out::println;
							 	//::내부클래스를 말함 메소드
		consumer2.accept("Hello World 4");
		
		//Supplier<String> Supplier1 = String::new
		
		
		
		
		
	}

}
