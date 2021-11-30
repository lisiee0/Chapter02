package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01= new Person("홍길동", 18);
		
		p01.showInfo();
		
		
		Student s01= new Student("이몽룡", 21, "장원급제");
		
		s01.showInfo();
		
		Person ps01= new Student("강호동", 45, "마산고등학교");
		
		ps01.showInfo();
		System.out.println(ps01.toString());
	}

}