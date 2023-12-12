package com.dipendenti.service;

import java.util.List;
import java.util.Optional;

import com.dipendenti.entity.Uscite;

public interface UsciteService {
	
	List<Uscite> getTutteUscite();
	
	void saveUscita(Uscite uscite);
	
	void updateUscita(Uscite uscita, Long id);
	
	void deleteUscita(Long id);
	
	Optional<Uscite> getUscita(Long id);
}
