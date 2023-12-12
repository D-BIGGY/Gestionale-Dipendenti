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

	void addDip(Dipendente dip);

	void cancDip(long id);

	public Dipendente modDip(long id, Dipendente dipendente) throws MethodArgumentNotValidException;

}
