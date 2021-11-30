package com.javaex.ex13;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		Rectangle[] rArray= new Rectangle[3];
		
		Rectangle r01= new Rectangle("빨강", "노랑", 10, 6);
		Rectangle r02= new Rectangle("파랑", "분홍", 23, 3);
		Rectangle r03= new Rectangle("초록", "검정", 5, 4);
		
		rArray[0]= r01;
		rArray[1]= r02;
		rArray[2]= r03;
		
		for(int i= 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		Circle[] cArray= new Circle[3];
		
		Circle c01= new Circle("초록", "파랑", 7);
		Circle c02= new Circle("빨강", "노랑", 2);
		Circle c03= new Circle("연두", "하늘", 11);
		
		cArray[0]= c01;
		cArray[1]= c02;
		cArray[2]= c03;
		
		for(int i= 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		Triangle[] tArray= new Triangle[3];
		
		Triangle t01= new Triangle("검정", "하양", 4, 9);
		Triangle t02= new Triangle("분홍", "파랑", 6, 13);
		Triangle t03= new Triangle("초록", "빨강", 44, 27);
		
		tArray[0]= t01;
		tArray[1]= t02;
		tArray[2]= t03;
		
		for(int i= 0; i<cArray.length; i++) {
			tArray[i].draw();
		}
		
	}	
}
