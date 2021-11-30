package com.javaex.ex15;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle() {
		
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	public void draw() {
		System.out.println("선 색: "+lineColor+", 면 색: "+fillColor+", 반지름: "+radius+" 원을 그렸습니다.");
	}
	
	
	
}
