package br.edu.atitus.poo.atitusound.dtos;

import java.time.Duration;

public class MusicDTO {

	private String name;
	
	private Duration duration;
	
	private String url;
	
	private OnlyUuidDTO artist;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public OnlyUuidDTO getArtist() {
		return artist;
	}

	public void setArtist(OnlyUuidDTO artist) {
		this.artist = artist;
	}
	
	
}
