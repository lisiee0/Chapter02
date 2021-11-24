package com.javaex.ex07;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv= new TV(7, 20, false);
		System.out.println("TV 초기화값");
		System.out.println(tv.status());
		System.out.println(" ");
		
		tv.power(true);
		System.out.println("TV turn on");
		System.out.println(tv.status());
		System.out.println(" ");
		
		
		tv.volume(55);
		tv.volume(false);
		System.out.println("TV 볼륨 55 입력 후 1줄임");
		System.out.println(tv.status());
		System.out.println(" ");
		
		tv.volume(120);
		System.out.println("볼륨 100이상 입력시");
		System.out.println(tv.status());
		System.out.println(" ");
		
		System.out.println("1~255 숫자 입력 안했을시");
		tv.channel(340);	
		System.out.println(tv.status());
		System.out.println(" ");
		
		tv.channel(30);
		tv.channel(true);
		System.out.println("채널 30 입력 후 1올림");
		System.out.println(tv.status());
		System.out.println(" ");
		
		tv.power(false);
		System.out.println("TV turn off");
		System.out.println(tv.status());
	
	}
}
