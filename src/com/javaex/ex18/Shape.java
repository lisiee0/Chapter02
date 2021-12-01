package com.javaex.ex18;

public abstract class Shape {
	
	
	// 필드
	protected String lineColor;
	protected String fillColor;
	
	// 생성자 
	public Shape() {
		
	}

	public Shape(String lineColor, String fillColor) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
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

	// 메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	// abstract 사용하기 
	// public abstract void draw(); Drawable 사용
	
	public abstract double area();
}
