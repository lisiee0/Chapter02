package com.javaex.ex13;

public class Circle {
	
	
	private String lineColor;
	private String fillColor;
	private int radius;
	
	
	public Circle() {
		
	}
	public Circle(String lineColor, String fillColor, int radius) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.radius = radius;
	}
	
	
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radius=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("선 색: "+lineColor+", 면 색: "+fillColor+", 반지름: "+radius+" 원을 그렸습니다.");
	}
	
	
	
}
