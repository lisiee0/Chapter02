package com.javaex.ex16;

public class Student extends Person	{
	
	private String schoolName;


	public Student() {
		super();
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
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

	public void showInfo() {
		System.out.println("====================================");
		System.out.println("이름: "+name+", 나이: "+age+"입니다.");
		System.out.println("학교: "+schoolName);
		System.out.println("====================================");
	}
	
	
}
