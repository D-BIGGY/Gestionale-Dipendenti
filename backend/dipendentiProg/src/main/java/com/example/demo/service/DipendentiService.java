package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.example.demo.entity.Dipendente;

@Service
public interface DipendentiService {

	Iterable<Dipendente> getTuttiDip();

	void addDip(Dipendente dip);

	void cancDip(long id);

	public Dipendente modDip(long id, Dipendente dipendente) throws MethodArgumentNotValidException;

}
