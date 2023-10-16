package br.edu.atitus.poo.atitusound.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.poo.atitusound.dtos.ArtistDTO;
import br.edu.atitus.poo.atitusound.entities.ArtistEntity;

@RestController
@RequestMapping("/artists")
public class ArtistController {
	
	private ArtistEntity convertDTO2Entity(ArtistDTO dto) {
		ArtistEntity newArtist = new ArtistEntity();
		newArtist.setName(dto.getName());
		newArtist.setImage(dto.getImage());
		return newArtist;
	}
	
	@PostMapping
	public ResponseEntity<ArtistEntity> salvar(@RequestBody ArtistDTO artist) {
		ArtistEntity newArtist = convertDTO2Entity(artist);
		//TODO invocar método salvar da Service Artist
		return ResponseEntity.status(HttpStatus.CREATED).body(newArtist);
	}
	
	@GetMapping
	public ResponseEntity<List<ArtistEntity>> pesquisar(){
		//TODO invocar o metodo de pesquisa da Service
		List<ArtistEntity> lista = new ArrayList<>();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/{uuid}")
	public ResponseEntity<ArtistEntity> pesquisarPorUuid(@PathVariable UUID uuid) {
		ArtistEntity artist = new ArtistEntity();
		artist.setUuid(uuid);
		return ResponseEntity.ok(artist);
	}

}
