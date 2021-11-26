package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01= new Point(12, 5);		
		p01.showInfo();
	
		System.out.println("--------------------------------");
		
		
		ColorPoint cp01= new ColorPoint("red");
		cp01.setX(15);
		cp01.setY(6);
		cp01.showInfo2();
		
		System.out.println("--------------------------------");
		
		ColorPoint cp02= new ColorPoint(4, 9, "blue");
		cp02.showInfo2();
		
	}

}
