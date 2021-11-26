package com.javaex.ex12;

public class ColorPoint extends Point{
	
	// 필드
	private String color;
	
	// 생성자
	public ColorPoint() {
		System.out.println("test-ColorPoint()");
	}
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("test-ColorPoint(1)");
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("test-ColorPoint(3)");
	}



	// 메소드 g/s
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	// 메소드 일반
	public void showInfo2() {
		System.out.println("-----------------------------------");
		System.out.println("x= "+x+", y= "+y+", 색깔은 "+color+"입니다.");
		System.out.println("-----------------------------------");
		System.out.println("");
	}
}
