package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera= new Goods("니콘", 400000);
		
		Goods computer= new Goods("LG그램", 900000);
		
		Goods cup= new Goods("머그컵", 2000);
		
		System.out.println(camera.toString());
		System.out.println(computer.toString());
		System.out.println(cup.toString());


	}
}
