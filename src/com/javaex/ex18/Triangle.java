package com.javaex.ex18;

public class Triangle extends Shape implements Drawable{
	
	private int width;
	private int height;
	
	
	
	public Triangle() {
		
	}

	public Triangle(String lineColor, String fillColor, int width, int height) {
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
		return "Triangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	public void draw() {
		System.out.println("선 색: "+lineColor+", 면 색: "+fillColor+", 가로: "+width+", 세로: "+height+" 삼각형을 그렸습니다.");
	}
	
	public double area() {
		double result= (width*height)/2;
		return result;
	}
}
