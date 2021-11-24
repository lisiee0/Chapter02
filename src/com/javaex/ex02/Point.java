package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x= x;
		this.y= y;
	}
	
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
	
	// action true 그리는 기능, action= false 지우는 기능
	public void draw(boolean action) {
		if(action==true) {
			System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		}
		else if(action==false) {
			System.out.println("점[x="+x+", y="+y+"]을 지웠습니다.");
		}
		else {
			System.out.println("잘못된 입력");
		}
	}
}
