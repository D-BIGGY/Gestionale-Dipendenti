package com.dipendenti.service.impl;

import java.util.List;
import java.util.Optional;

import com.dipendenti.entity.Uscite;
import com.dipendenti.repository.RepositoryUscite;
import com.dipendenti.service.UsciteService;

public class UsciteServiceImpl implements UsciteService {
	
	public RepositoryUscite repositoryUscite;

	@Override
	public List<Uscite> getTutteUscite() {
		return  (List<Uscite>) repositoryUscite.findAll();
	}

	@Override
	public void saveUscita(Uscite uscite) {
		repositoryUscite.save(uscite);
	}

	@Override
	public void updateUscita(Uscite uscita, Long id) {
		Optional<Uscite> existingUscitaOptional = repositoryUscite.findById(id);

		// Estrai l'uscita esistente
		Uscite existingUscita = existingUscitaOptional.get();

		// Aggiorna la data dell'uscita
		existingUscita.setDataUscita(uscita.getDataUscita());

		// Salva l'uscita con la data aggiornata
		repositoryUscite.save(existingUscita);		
	}

	@Override
	public void deleteUscita(Long id) {
		repositoryUscite.deleteById(id);
	}

	@Override
	public Optional<Uscite> getUscita(Long id) {
		return repositoryUscite.findById(id);
	}
	
}
