package com.javaex.ex13;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		
		Rectangle r01= new Rectangle("빨강", "노랑", 10, 6);
		
		r01.draw();
		
		Circle c01= new Circle("초록", "파랑", 7);
		
		c01.draw();
		
		Triangle t01= new Triangle("검정", "하양", 4, 9);
		
		t01.draw();
	}
	
}
