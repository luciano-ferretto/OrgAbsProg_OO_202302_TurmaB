package br.edu.atitus.poo.atitusound.servicesimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.edu.atitus.poo.atitusound.entities.ArtistEntity;
import br.edu.atitus.poo.atitusound.repositories.ArtistRepository;
import br.edu.atitus.poo.atitusound.services.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {
	private final ArtistRepository repository;

	public ArtistServiceImpl(ArtistRepository repository) {
		super();
		this.repository = repository;
	}

	protected void validate(ArtistEntity entity) throws Exception {
		if (entity.getName() == null || entity.getName().isEmpty())
			throw new Exception("Campo nome requerido!");
		if (entity.getUuid() == null) {
			if (repository.existsByName(entity.getName()))
				throw new Exception("Já existe registro com este nome!");
		} else {
			if (!repository.existsById(entity.getUuid()))
				throw new Exception("Registro não encontrado com este UUID");
			if (repository.existsByNameAndUuidNot(entity.getName(), entity.getUuid()))
				throw new Exception("Já existe registro com este nome!");
		}
	}

	@Override
	public ArtistEntity save(ArtistEntity entity) throws Exception {
		validate(entity);
		return repository.save(entity);
	}

	@Override
	public List<ArtistEntity> findAll() throws Exception {
		return repository.findAll();
	}

	@Override
	public Page<List<ArtistEntity>> findByName(Pageable pageable, String name) throws Exception {
		return repository.findByNameContainingIgnoreCase(pageable, name);
	}

	@Override
	public Optional<ArtistEntity> findById(UUID uuid) {
		return repository.findById(uuid);
	}

	@Override
	public void deleteById(UUID uuid) throws Exception {
		if (!repository.existsById(uuid))
			throw new Exception("Não existe registro com este UUID.");
		repository.deleteById(uuid);
		
	}

}
