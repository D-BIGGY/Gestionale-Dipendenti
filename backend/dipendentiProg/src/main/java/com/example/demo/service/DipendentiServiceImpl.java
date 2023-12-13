package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dipendente;
import com.example.demo.repository.DipendentiRepository;
import com.example.demo.service.DipendentiService;
import org.springframework.security.crypto.bcrypt.BCrypt;

@Service
public class DipendentiServiceImpl implements DipendentiService {
	@Autowired
	public DipendentiRepository diprepo;
	public String salt="123";

	public DipendentiServiceImpl(DipendentiRepository diprepo) {
		super();
		this.diprepo = diprepo;
	}

	public Iterable<Dipendente> getTuttiDip() {
		return diprepo.findAll();
	}

	public void addDip(Dipendente dip) {
		String pwhash = BCrypt.hashpw(dip.getPassword(), BCrypt.gensalt());
		dip.setPassword(pwhash);
		diprepo.save(dip);
	}

	public void cancDip(long id) {
		diprepo.deleteById(id);
	}

	public Dipendente modDip(long id, Dipendente dipendente) throws MethodArgumentNotValidException {

		/*
		 * Dipendente dip = diprepo.findById(id).get();
		 * dip.setUsername(dipendente.getUsername()); dip.setNome(dipendente.getNome());
		 * dip.setCognome(dipendente.getCognome());
		 * dip.setMatricola(dipendente.getMatricola());
		 * dip.setEmail(dipendente.getEmail()); dip.setRuolo(dipendente.getRuolo());
		 */
		dipendente.setId(id);
		return diprepo.save(dipendente);
	}

	public Optional<Dipendente> getDip(long id) {
		return diprepo.findById(id);
	}

	public Boolean /*String*/ login(Dipendente dip) {
		Boolean temp = false;

		Dipendente d1 = diprepo.findByUsername(dip.getUsername());

		if (BCrypt.checkpw(dip.getPassword(), d1.getPassword())) {
			temp = true;
		}

		return temp/* + "," + d1.getId() + "," + d1.getNome()*/;
	}

	@Override
	public Dipendente getRuolo(Dipendente dip) {
		return diprepo.findByUsername(dip.getUsername());
	}

}
