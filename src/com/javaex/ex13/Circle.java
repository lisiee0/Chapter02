package com.javaex.ex13;

public class Circle {
	
	// 필드
	private String lineColor;
	private String fillColor;
	private int radius;


	// 생성자
	public Circle() {
		
	}
	
	public Circle(String lineColor, String fillColor, int radius) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.radius = radius;
	}
	
	// 메소드 g/s	
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

	// 메소드 일반
	
	@Override
	public String toString() {
		return "Circle [lineColor= " + lineColor + ", fillColor= " + fillColor + ", radius= " + radius + "]";
	}

}
