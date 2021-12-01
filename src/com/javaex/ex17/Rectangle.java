package com.javaex.ex17;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle() {
		
	}

	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width= " + width + ", height= " + height + ", lineColor= " + lineColor + ", fillColor= "
				+ fillColor + "]";
	}

	public void draw() {
		System.out.println("선 색: "+lineColor+", 면 색: "+fillColor+", 가로: "+width+", 세로: "+height+" 사각형을 그렸습니다.");
	}
	
	public double area() {
		double result= width*height;
		return result;
	}
	
}
