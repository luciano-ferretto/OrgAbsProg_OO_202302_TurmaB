package br.edu.atitus.poo.atitusound.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.poo.atitusound.dtos.ArtistDTO;
import br.edu.atitus.poo.atitusound.entities.ArtistEntity;
import br.edu.atitus.poo.atitusound.services.ArtistService;

@RestController
@RequestMapping("/artists")
public class ArtistController {
	//Possui uma dependência do tipo ArtistService
	private final ArtistService service;
	
	public ArtistController(ArtistService service) {
		super();
		this.service = service;
	}

	protected ArtistEntity convertDTO2Entity(ArtistDTO dto) {
		ArtistEntity newArtist = new ArtistEntity();
		newArtist.setName(dto.getName());
		newArtist.setImage(dto.getImage());
		return newArtist;
	}
	
	@PutMapping("/{uuid}")
	public ResponseEntity<ArtistEntity> alterar(@PathVariable UUID uuid, @RequestBody ArtistDTO dto) {
		ArtistEntity entidade = convertDTO2Entity(dto);
		entidade.setUuid(uuid);
		try {
			service.save(entidade);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.ok(entidade);
	}
	
	@DeleteMapping("/{uuid}")
	public ResponseEntity<?> deletar(@PathVariable UUID uuid) {
		try {
			service.deleteById(uuid);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.ok().build();
	}
	
	@PostMapping
	public ResponseEntity<ArtistEntity> salvar(@RequestBody ArtistDTO artist) {
		ArtistEntity newArtist = convertDTO2Entity(artist);
		try {
			service.save(newArtist);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(newArtist);
	}
	
	@GetMapping
	public ResponseEntity<Page<List<ArtistEntity>>> pesquisar(@PageableDefault(page = 0, size = 5, sort = "name", direction = Direction.ASC) Pageable pageable,  @RequestParam String name){
		Page<List<ArtistEntity>> lista;
		try {
			lista = service.findByName(pageable, name);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/{uuid}")
	public ResponseEntity<ArtistEntity> pesquisarPorUuid(@PathVariable UUID uuid) {
		Optional<ArtistEntity> artist = service.findById(uuid);
		if (artist.isEmpty())
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(artist.get());
	}

}
