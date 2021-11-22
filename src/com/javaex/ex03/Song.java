package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void settitle(String t) {
		title= t;
	}
	public String gettitle() {
		return title;
	}
	public void setartist(String a) {
		artist= a;
	}
	public String getartist() {
		return artist;
	}
	public void setalbum(String al) {
		album= al;
	}
	public String getalbum() {
		return album;
	}
	public void setcomposer(String c) {
		composer= c;
	}
	public String getcomposer() {
		return composer;
	}
	public void setyear(int y) {
		year= y;
	}
	public int getyear() {
		return year;
	}
	public void settrack(int tr) {
		track= tr;
	}
	public int gettrack() {
		return track;
	}
	public void showInfo() {
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}
	
	
}
