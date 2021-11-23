package com.javaex.ex05;

public class Song {

	
	//필드
	String title;
	String artist;
	String album;
	String composer;
	int year;
	int track;

	
	//생성자
	public Song() {
		System.out.println("default");
	}
	public Song(String artist, String title, String album, int year, int track, String composer) {
		System.out.println("6m");
		this.artist= artist;
		this.title= title;
		this.album= album;
		this.year= year;
		this.track= track;
		this.composer= composer;
	}
	
	//메소드 g/s
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Song [artist= " + artist + ", title= " + title + ", album= " + album + ", year= " + year + ", track= "
				+ track + ", composer= " + composer + "]";
	}

	
	
}
