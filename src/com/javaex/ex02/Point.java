package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	public void setX(int xp) {
		x= xp;
	}
	public int getX() {
		return x;
	}
	public void setY(int yp) {
		y= yp;
	}
	public int getY() {
		return y;
	}
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
}
