package com.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "song")
public class SongEntity {

	@Id
	private int id;
	
	private String name;
	
	private String artist;

	@Override
	public String toString() {
		return "SongEntity [id=" + id + ", name=" + name + ", aritist=" + artist + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	
	
	
}
