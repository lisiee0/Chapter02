package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Shape[] sArray= new Shape[3];
		
		Shape r01= new Rectangle("빨강", "빨강", 5, 5);
		Shape c01= new Circle("노랑", "노랑", 7);
		Shape t01= new Triangle("파랑", "파랑", 10, 6);
		
		sArray[0]= r01;
		sArray[1]= c01;
		sArray[2]= t01;
		
		
		// 각자의 draw 메소드로 출력
		for(int i= 0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		*/
		
		
		/*
		Rectangle r01= new Rectangle("빨강", "빨강", 5, 10);
		System.out.println(r01.area());
		
		Circle c01= new Circle("파랑", "파랑", 5);
		System.out.println(c01.area());
		
		Triangle t01= new Triangle("노랑", "노랑", 5, 10);
		System.out.println(t01.area());
		*/
		
		
		Shape[] sArray= new Shape[3];
		
		Shape r01= new Rectangle("빨강", "빨강", 5, 10);
		Shape c01= new Circle("파랑", "파랑", 5);
		Shape t01= new Triangle("노랑", "노랑", 5, 10);
		
		sArray[0]= r01;
		sArray[1]= c01;
		sArray[2]= t01;
		
		for(int i= 0; i<sArray.length; i++) {
			sArray[i].draw();
			System.out.println("도형의 면적은 "+sArray[i].area()+"입니다.");
		}
		
	}
}
