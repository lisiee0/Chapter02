package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle r01= new Rectangle("빨강", "노랑", 5, 5);
		Rectangle r02= new Rectangle("파랑", "노랑", 10, 20);
		Rectangle r03= new Rectangle("빨강", "빨강", 55, 77);
		
		Rectangle[] rArray= new Rectangle[3];
		
		rArray[0]= r01;
		rArray[1]= r02;
		rArray[2]= r03;
			
		for(int i= 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		// 선 색만 출력하기
		for(int i= 0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLineColor());
		}
		
		// 원을 관리할 배열 생성
		Circle[] cArray= new Circle[3];
		
		// 원 3개를 만듦
		Circle c01= new Circle("보라", "빨강", 15);
		Circle c02= new Circle("검정", "노랑", 5);
		Circle c03= new Circle("파랑", "초록", 7);
		
		// 원을 배열에 넣기
		cArray[0]= c01;
		cArray[1]= c02;
		cArray[2]= c03;
		
		for(int i= 0; i<rArray.length; i++) {
			cArray[i].draw();
		}
		
		Triangle[] tArray= new Triangle[3];
		
		Triangle t01= new Triangle("검정", "파랑", 10, 8);
		Triangle t02= new Triangle("주황", "분홍", 22, 5);
		Triangle t03= new Triangle("하늘", "노랑", 4, 4);
		
		tArray[0]= t01;
		tArray[1]= t02;
		tArray[2]= t03;
		
		for(int i= 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
	}
}