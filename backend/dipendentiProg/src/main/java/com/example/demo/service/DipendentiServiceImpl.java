package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dipendente;
import com.example.demo.repository.DipendentiRepository;
import com.example.demo.service.DipendentiService;

@Service
public class DipendentiServiceImpl implements DipendentiService {
	@Autowired
	public DipendentiRepository diprepo;

	public DipendentiServiceImpl(DipendentiRepository diprepo) {
		super();
		this.diprepo = diprepo;
	}

	public Iterable<Dipendente> getTuttiDip() {
		return diprepo.findAll();
	}

	public void addDip(Dipendente dip) {
		diprepo.save(dip);
	}

	public void cancDip(long id) {
		diprepo.deleteById(id);
	}

	public Dipendente modDip(long id, Dipendente dipendente) throws MethodArgumentNotValidException {

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