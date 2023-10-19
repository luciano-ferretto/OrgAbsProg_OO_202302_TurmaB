package br.edu.atitus.poo.atitusound.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.edu.atitus.poo.atitusound.entities.GenericEntity;

@NoRepositoryBean
public interface GenericRepository<TEntidade extends GenericEntity> extends JpaRepository<TEntidade, UUID>{

	Boolean existsByName(String name);
	
	Boolean existsByNameAndUuidNot(String name, UUID uuid);
	
	Page<List<TEntidade>> findByNameContainingIgnoreCase(Pageable pageable, String name);
}
