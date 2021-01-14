package com.cg.lab4.q3.domain;

public class Cd extends  MediaItem{
    private String artist;
    private String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean equals(Object ob) {
		if(ob==null) {
			return false;
		}
		MediaItem mi=(MediaItem) ob;
		return super.equals(mi)&& getRunTime()==mi.getRunTime();
	}
	@Override
	public int getRunTime() {
		
		return super.getRunTime();
	}
}
