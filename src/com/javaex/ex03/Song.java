package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
// get,set값 적용해야하오..
	
	public Song() {
		System.out.println("파라미터 0개");
	}

	public Song(String title, String artist, String album, String composer, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("파라미터 5개");
	}

	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title,artist,album,composer,year);
		this.track = track;
		System.out.println("파라미터6개");
	}

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

	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}


	
	
	
}



