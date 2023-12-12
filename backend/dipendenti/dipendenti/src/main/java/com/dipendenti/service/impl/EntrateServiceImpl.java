package com.dipendenti.service.impl;

import java.util.List;
import java.util.Optional;

import com.dipendenti.entity.Entrate;
import com.dipendenti.repository.RepositoryEntrate;
import com.dipendenti.service.EntrateService;

public class EntrateServiceImpl implements EntrateService{
	public RepositoryEntrate repositoryEntrate;

	@Override
	public List<Entrate> getTutteEntrate() {
		return (List<Entrate>) repositoryEntrate.findAll();
	}

	@Override
	public void save(Entrate entrate) {
		repositoryEntrate.save(entrate);
	}

	@Override
	public void updateEntrata(Entrate entrata, Long id) {
		Optional<Entrate> existingEntrataOptional = repositoryEntrate.findById(id);

		// Estrai l'entrata esistente
		Entrate existingEntrata = existingEntrataOptional.get();

		// Aggiorna la data dell'entrata
		existingEntrata.setDataEntrata(entrata.getDataEntrata());

		// Salva l'entrata con la data aggiornata
		repositoryEntrate.save(existingEntrata);
		
	}

	@Override
	public void deleteEntrata(Long id) {
		repositoryEntrate.deleteById(id);
	}

	@Override
	public Optional<Entrate> getEntrate(Long id) {
		return repositoryEntrate.findById(id);
	}

}
