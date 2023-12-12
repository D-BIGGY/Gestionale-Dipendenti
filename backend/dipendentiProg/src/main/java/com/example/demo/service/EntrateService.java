package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Entrate;

@Service
public interface EntrateService {
	 
	List<Entrate> getTutteEntrate();
	
	void save(Entrate entrate);
	
	void updateEntrata(Entrate entrata, Long id);
	
	void deleteEntrata(Long id);
	
	Optional<Entrate> getEntrate(Long id);
	
}