package br.edu.atitus.poo.atitusound.entities;

import java.util.UUID;

public class ArtistEntity {
	
	private UUID uuid;
	
	private String name;
	
	private String image;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
}
