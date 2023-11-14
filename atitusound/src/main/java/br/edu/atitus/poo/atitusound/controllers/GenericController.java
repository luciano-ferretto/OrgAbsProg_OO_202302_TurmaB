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
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.atitus.poo.atitusound.entities.GenericEntity;
import br.edu.atitus.poo.atitusound.services.GenericService;

public abstract class GenericController<TEntidade extends GenericEntity, TDto> {
	
	protected abstract GenericService<TEntidade> getService();

	protected abstract TEntidade convertDTO2Entity(TDto dto);
	
	@PutMapping("/{uuid}")
	public ResponseEntity<TEntidade> alterar(@PathVariable UUID uuid, @RequestBody TDto dto) {
		TEntidade entidade = convertDTO2Entity(dto);
		entidade.setUuid(uuid);
		try {
			getService().save(entidade);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.ok(entidade);
	}
	
	@DeleteMapping("/{uuid}")
	public ResponseEntity<?> deletar(@PathVariable UUID uuid) {
		try {
			getService().deleteById(uuid);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.ok().build();
	}
	
	@PostMapping
	public ResponseEntity<TEntidade> salvar(@RequestBody TDto artist) {
		TEntidade newArtist = convertDTO2Entity(artist);
		try {
			getService().save(newArtist);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(newArtist);
	}
	
	@GetMapping
	public ResponseEntity<Page<List<TEntidade>>> pesquisar(@PageableDefault(page = 0, size = 5, sort = "name", direction = Direction.ASC) Pageable pageable,  @RequestParam String name){
		Page<List<TEntidade>> lista;
		try {
			lista = getService().findByName(pageable, name);
		} catch (Exception e) {
			return ResponseEntity.badRequest().header("error", e.getMessage()).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/{uuid}")
	public ResponseEntity<TEntidade> pesquisarPorUuid(@PathVariable UUID uuid) {
		Optional<TEntidade> artist = getService().findById(uuid);
		if (artist.isEmpty())
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(artist.get());
	}

}
