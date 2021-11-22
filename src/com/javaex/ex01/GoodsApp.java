package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
	
		Goods camera= new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		Goods computer= new Goods();
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		computer.showInfo();
		
		Goods cup= new Goods();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		cup.showInfo();
		
		// System.out.println(camera.getName());
		// System.out.println(camera.getPrice());
		
		/* 
		camera.name= "니콘";
		camera.price= 400000;
		
		Goods computer= new Goods();
		computer.name= "LG그램";
		computer.price= 900000;
		
		Goods cup= new Goods();
		cup.name= "머그컵";
		cup.price= 2000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		*/
	}
}
