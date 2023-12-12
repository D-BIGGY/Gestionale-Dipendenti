package com.dipendenti.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.dipendenti.entity.Dipendente;

import jakarta.validation.Valid;

@Service
public interface DipendentiService {

	List<Dipendente> getTuttiDip();

	void addDip(@Valid @RequestBody Dipendente dip);

	void cancDip(@PathVariable("id") long id);

	public Dipendente modDip(@PathVariable("id") long id, @Valid @RequestBody Dipendente dipendente)
			throws MethodArgumentNotValidException;

}
