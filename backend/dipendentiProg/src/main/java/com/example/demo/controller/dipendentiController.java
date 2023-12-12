package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dipendente;
import com.example.demo.entity.Entrate;
import com.example.demo.entity.Uscite;
import com.example.demo.service.DipendentiService;
import com.example.demo.service.EntrateService;
import com.example.demo.service.UsciteService;

@RestController
@RequestMapping("/gestionale/api")
@CrossOrigin
public class dipendentiController {

	@Autowired
	DipendentiService dipserv;
	@Autowired
	EntrateService entserv;
	@Autowired
	UsciteService uscserv;

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

	@PostMapping("/aggEntrata")
	public void aggEntr(Entrate entrate) {
		entserv.save(entrate);
	}

	@GetMapping("/entrata")
	public Optional<Entrate> getEntrate(Long id) {
		return entserv.getEntrate(id);
	}

	@PutMapping("/modificaEntrata")
	public void modEnt(Entrate entrate, Long id) {
		entserv.updateEntrata(entrate, id);
	}

	@DeleteMapping("/cancEntrata")
	public void delEnt(Long id) {
		entserv.deleteEntrata(id);
	}

	@GetMapping("/aggUscita")
	public void aggUsc(Uscite uscite) {
		uscserv.saveUscita(uscite);
	}

	@GetMapping("/uscita")
	public Optional<Uscite> getUscite(Long id) {
		return uscserv.getUscita(id);
	}

	@PutMapping("/modificaUscita")
	public void modUsc(Uscite uscite, Long id) {
		uscserv.updateUscita(uscite, id);
	}

	@DeleteMapping("/cancUscita")
	public void delUsc(Long id) {
		uscserv.deleteUscita(id);
	}

	@GetMapping("/uscite")
	public List<Uscite> getUscita() {
		return uscserv.getTutteUscite();
	}
}
