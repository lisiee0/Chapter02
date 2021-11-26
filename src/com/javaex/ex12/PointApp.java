package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01= new Point(12, 5);
		
		p01.showInfo();
		
		ColorPoint cp01= new ColorPoint("red");
		
		ColorPoint cp02= new ColorPoint(4, 9, "blue");
		
		cp02.showInfo2();
		
	}

}
