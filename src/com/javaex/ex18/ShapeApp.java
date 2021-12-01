package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Point p01= new Point(5, 7);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02= new Point(114, 117);
		p02.draw();
		System.out.println(((Point)p02).getX()); // 다운캐스팅 해서 사용
		*/
		
		Drawable[] dArray= new Drawable[4];
		
		Drawable c01= new Circle("파랑", "파랑", 5);
		Drawable r01= new Rectangle("빨강", "빨강", 5, 5);
		Drawable t01= new Triangle("초록", "초록", 10, 6);
		Drawable p01= new Point(4, 7);
		
		dArray[0]= c01;
		dArray[1]= r01;
		dArray[2]= t01;
		dArray[3]= p01;
		
		for(int i= 0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		
	}
}
