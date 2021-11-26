package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
		
		/*
		Person p01= new Person("정우성", 45);
		
		Person p02= new Person("이정재", 46);

		p01.showInfo();
		p02.showInfo();
		*/
		
		// student 상속받은 후
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		Student s01= new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("서울고등학교");
		
		Student s02= new Student("서장훈", 45, "강남고등학교");
		
		s02.showInfo2();
	}
}
