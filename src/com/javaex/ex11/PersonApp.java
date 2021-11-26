package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01= new Person("정우성", 45);
		
		Person p02= new Person();
		p02.setName("이정재");
		p02.setAge(46);
		
		// System.out.println(p01.toString());
		// System.out.println(p02.toString());
		p01.showInfo();
		p02.showInfo();
		
	}

}
