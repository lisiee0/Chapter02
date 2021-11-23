package com.javaex.ex05;

public class SongApp {
	//필드
	
	//생성자
	
	//메소드 g/s
	
	// 메소드 일반
	
	public static void main(String[] args) {
		
		Song s1= new Song();
		
		s1.artist= "아이유";
		s1.title= "좋은날";
		s1.album= "Real";
		s1.year= 2010;
		s1.track= 3;
		s1.composer= "이민수";
		
		System.out.println(s1.toString());

		Song s2= new Song("BIGBANG", "거짓말", "Alway", 2007, 2, "G-DRAGON");
		
		System.out.println(s2.toString());
	}
}
