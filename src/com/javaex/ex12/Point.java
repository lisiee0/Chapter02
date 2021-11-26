package com.javaex.ex12;

public class Point {

	
	// 필드 
	protected int x;
	protected int y;
	
	// 생성자
	public Point() {
		System.out.println("test-Point()");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("test-Point(2)");
	}

	// 메소드 g/s
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	// 메소드
	public void showInfo() {
		System.out.println("x= "+x+", y= "+y+"입니다.");
	}
}
