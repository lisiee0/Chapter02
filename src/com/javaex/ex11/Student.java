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
		/*  Person의 필드를 private으로 설정하면 사용X
		super.name= name;
		super.age= age;
		*/
		super(name, age);
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
}
