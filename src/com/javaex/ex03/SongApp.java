package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1= new Song();
		
		s1.settitle("좋은날");
		s1.setartist("아이유");
		s1.setalbum("Real");
		s1.setcomposer("이민수");
		s1.setyear(2010);
		s1.settrack(3);
		
		s1.showInfo();
		
		Song s2= new Song();
		
		s2.settitle("거짓말");
		s2.setartist("BIGBANG");
		s2.setalbum("Always");
		s2.setcomposer("G-DRAGON");
		s2.setyear(2007);
		s2.settrack(2);
		
		s2.showInfo();
		
		Song s3= new Song();
		
		s3.settitle("벚꽃엔딩");
		s3.setartist("버스커버스커");
		s3.setalbum("버스커버스커1집");
		s3.setcomposer("장범준");
		s3.setyear(2012);
		s3.settrack(4);
		
		s3.showInfo();
		
	}
}
