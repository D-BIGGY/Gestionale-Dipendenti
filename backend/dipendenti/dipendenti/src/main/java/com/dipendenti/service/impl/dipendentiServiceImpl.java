package com.dipendenti.service.impl;

import java.util.List;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.dipendenti.entity.Dipendente;
import com.dipendenti.repository.DipendentiRepository;
import com.dipendenti.service.DipendentiService;

import jakarta.validation.Valid;

public class dipendentiServiceImpl implements DipendentiService {

	DipendentiRepository diprepo;

	public dipendentiServiceImpl(DipendentiRepository diprepo) {
		super();
		this.diprepo = diprepo;
	}

	public List<Dipendente> getTuttiDip() {
		return diprepo.findAll();
	}

	public void addDip(@Valid @RequestBody Dipendente dip) {
		diprepo.save(dip);
	}

	public void cancDip(@PathVariable("id") long id) {
		diprepo.deleteById(id);
	}

	public Dipendente modDip(@PathVariable("id") long id, @Valid @RequestBody Dipendente dipendente)
			throws MethodArgumentNotValidException {

		Dipendente dip = diprepo.findById(id).get();
		dip.setUsername(dipendente.getUsername());
		dip.setNome(dipendente.getNome());
		dip.setCognome(dipendente.getCognome());
		dip.setMatricola(dipendente.getMatricola());
		dip.setPassword(dipendente.getPassword());
		dip.setEmail(dipendente.getEmail());
		return dip;
	}

	
	
	
}
