package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle r01= new Ractangle("빨강", "노랑", 5, 5);
		Ractangle r02= new Ractangle("파랑", "노랑", 10, 20);
		Ractangle r03= new Ractangle("빨강", "빨강", 55, 77);
		
		Ractangle[] rArray= new Ractangle[3];
		
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
		
		Circle s01= new Circle("보라", "빨강", 15);
		
		
	}
}