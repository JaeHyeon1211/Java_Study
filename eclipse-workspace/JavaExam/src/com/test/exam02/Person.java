package com.test.exam02;

//getter, setter 자동으로 만드는법
//전역변수를 만들어준 후
//메뉴 > 소스 > Generate getter, setter 선택

public class Person {
	String name;
	int age;
	String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
