package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dipendente;
import com.example.demo.service.DipendentiService;

@RestController
@RequestMapping("/gestionale/api")
public class dipendentiController {

	@Autowired
	DipendentiService dipserv;

	@PostMapping("/aggiungiDipendente")
	public void addUtente(@RequestBody Dipendente dip) {
		dipserv.addDip(dip);
	}

	@GetMapping("/dipendente")
	public Iterable<Dipendente> getTuttiDip() {
		return dipserv.getTuttiDip();
	}

	@DeleteMapping("/cancellaDipendente")
	public void cancDip(long id) {
		dipserv.cancDip(id);
	}

	@PutMapping("/modificaDipendente")
	public Dipendente modDip(@RequestBody Dipendente dip, @PathVariable("id") long id)
			throws MethodArgumentNotValidException {

		return dipserv.modDip(id, dip);
	}

}
