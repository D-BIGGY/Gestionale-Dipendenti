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

	@PostMapping("/login")
	public Boolean /*String*/ login(@RequestBody Dipendente dip) {
		return dipserv.login(dip);
	}
	
	@PostMapping("/getRuolo")
	public Dipendente getRuoloDip(@RequestBody Dipendente dip) {
		return dipserv.getRuolo(dip);
	}


	@PostMapping("/aggiungiDipendente")
	public void addUtente(@RequestBody Dipendente dip) {
		dipserv.addDip(dip);
	}

	@GetMapping("/dipendente/{id}")
	public Optional<Dipendente> getDip(@PathVariable("id") Long id) {
		return dipserv.getDip(id);
	}

	@GetMapping("/dipendenti")
	public Iterable<Dipendente> getTuttiDip() {
		return dipserv.getTuttiDip();
	}

	@DeleteMapping("/cancellaDipendente/{id}")
	public void cancDip(@PathVariable("id") long id) {
		dipserv.cancDip(id);
	}

	@PutMapping("/modificaDipendente/{id}")
	public Dipendente modDip(@RequestBody Dipendente dip, @PathVariable("id") long id)
			throws MethodArgumentNotValidException {

		return dipserv.modDip(id, dip);
	}

	@PostMapping("/aggEntrata")
	public void aggEntr(@RequestBody Entrate entrate) {
		//entrate.setDataEntrata("2026-12-12T09:34:53.440+00:00");
		entserv.save(entrate);
	}

	@GetMapping("/entrata/{id}")
	public Optional<Entrate> getEntrate(@PathVariable("id") Long id) {
		return entserv.getEntrate(id);
	}

	@PutMapping("/modificaEntrata/{id}")
	public void modEnt(@RequestBody Entrate entrate, Long id) {
		entserv.updateEntrata(entrate, id);
	}

	@DeleteMapping("/cancEntrata/{id}")
	public void delEnt(@PathVariable("id") Long id) {
		entserv.deleteEntrata(id);
	}

	@GetMapping("/entrate")
	public List<Entrate> getTutteEntrate() {
		return entserv.getTutteEntrate();
	}

	@PostMapping("/aggUscita")
	public void aggUsc(@RequestBody Uscite uscite) {
		uscserv.saveUscita(uscite);
	}

	@GetMapping("/uscita/{id}")
	public Optional<Uscite> getUscita(@PathVariable("id") Long id) {
		return uscserv.getUscita(id);
	}

	@PutMapping("/modificaUscita/{id}")
	public void modUsc(@RequestBody Uscite uscite, @PathVariable("id") Long id) {
		uscserv.updateUscita(uscite, id);
	}

	@DeleteMapping("/cancUscita/{id}")
	public void delUsc(@PathVariable("id") Long id) {
		uscserv.deleteUscita(id);
	}

	@GetMapping("/uscite")
	public List<Uscite> getUscite() {
		return uscserv.getTutteUscite();
	}
}
