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
import br.edu.atitus.poo.atitusound.services.GenericService;

@RestController
@RequestMapping("/artists")
public class ArtistController extends GenericController<ArtistEntity, ArtistDTO>{
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

	@Override
	protected GenericService<ArtistEntity> getService() {
		return service;
	}

}
