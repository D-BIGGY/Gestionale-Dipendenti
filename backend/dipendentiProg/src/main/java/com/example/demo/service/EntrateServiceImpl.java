package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entrate;
import com.example.demo.repository.RepositoryEntrate;
import com.example.demo.service.EntrateService;

@Service
public class EntrateServiceImpl implements EntrateService {
	@Autowired
	public RepositoryEntrate repositoryEntrate;

	@Override
	public List<Entrate> getTutteEntrate() {
		return (List<Entrate>) repositoryEntrate.findAll();
	}

	@Override
	public void save(Entrate entrate) {
		entrate.setDataEntrata(new Date());
		System.out.println("suca");
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
