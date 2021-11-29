package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		/*
		Shape s01= new Shape("빨강", "빨강");
		System.out.println(s01.toString());
		*/
		
		Rectangle[] rArray= new Rectangle[3];
		
		Rectangle r01= new Rectangle("빨강", "빨강", 5, 5);
		Rectangle r02= new Rectangle("노랑", "노랑", 7, 7);
		Rectangle r03= new Rectangle("파랑", "파랑", 10, 10);
		
		rArray[0]= r01;
		rArray[1]= r02;
		rArray[2]= r03;
		
		for(int i= 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Circle[] cArray= new Circle[3];
		
		Circle c01= new Circle("검정", "파랑", 4);
		Circle c02= new Circle("초록", "빨강", 11);
		Circle c03= new Circle("하양", "노랑", 7);
		
		cArray[0]= c01;
		cArray[1]= c02;
		cArray[2]= c03;
		
		for(int i= 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		Triangle[] tArray= new Triangle[3];
		
		Triangle t01= new Triangle("주황", "보라", 10, 10);
		Triangle t02= new Triangle("파랑", "초록", 4, 8);
		Triangle t03= new Triangle("빨강", "검정", 13, 5);
		
		tArray[0]= t01;
		tArray[1]= t02;
		tArray[2]= t03;
		
		for(int i= 0; i<tArray.length; i++) {
			tArray[i].draw();
		}	
	}	
}
