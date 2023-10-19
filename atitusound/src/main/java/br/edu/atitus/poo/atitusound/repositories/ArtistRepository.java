package br.edu.atitus.poo.atitusound.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.atitus.poo.atitusound.entities.ArtistEntity;

@Repository
public interface ArtistRepository extends GenericRepository<ArtistEntity>{
	

}
