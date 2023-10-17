package br.edu.atitus.poo.atitusound.servicesimpl;

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

	@Override
	public ArtistEntity save(ArtistEntity entidade) throws Exception {
		if (entidade.getName() == null || entidade.getName().isEmpty())
			throw new Exception("Campo nome requerido!");
		return repository.save(entidade);
	}

}
