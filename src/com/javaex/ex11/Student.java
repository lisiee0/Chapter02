package com.javaex.ex11;

public class Student extends Person {
	
	private String schoolName;

	public Student() {	
		System.out.println("student()");
	}
	
	public Student(String schoolName) {
		this.schoolName= schoolName;
		System.out.println("student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		//  Person의 필드를 private으로 설정하면 사용X
		super.name= name;
		super.age= age;
		
		//super(name, age);
		this.schoolName= schoolName;
		System.out.println("student(3)");
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	public void showInfo() { // 전에 쓰던 메소드랑 이름 같게 하면 이전꺼 작동X
		System.out.println("********************************");
		System.out.println("이름: "+name);  // super.name 가능
		System.out.println("나이: "+age);
		System.out.println("학교: "+schoolName);
		System.out.println("********************************");
		System.out.println("");
	}
}
