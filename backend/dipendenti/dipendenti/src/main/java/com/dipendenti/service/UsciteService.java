package com.dipendenti.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.dipendenti.entity.Uscite;
@Service
public interface UsciteService {
	
	List<Uscite> getTutteUscite();
	
	void saveUscita(Uscite uscite);
	
	void updateUscita(Uscite uscita, Long id);
	
	void deleteUscita(Long id);
	
	Optional<Uscite> getUscita(Long id);
}
