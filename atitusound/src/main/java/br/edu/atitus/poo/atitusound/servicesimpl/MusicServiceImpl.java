package br.edu.atitus.poo.atitusound.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.poo.atitusound.entities.MusicEntity;
import br.edu.atitus.poo.atitusound.repositories.GenericRepository;
import br.edu.atitus.poo.atitusound.repositories.MusicRepository;
import br.edu.atitus.poo.atitusound.services.MusicService;

@Service
public class MusicServiceImpl implements MusicService{
	
	private final MusicRepository repository;
	
	public MusicServiceImpl(MusicRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public GenericRepository<MusicEntity> getRepository() {
		return repository;
	}

}
