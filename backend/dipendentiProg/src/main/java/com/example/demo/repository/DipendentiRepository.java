package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dipendente;

@Repository
public interface DipendentiRepository extends JpaRepository<Dipendente, Long> {

	Dipendente findByUsername(String username);

	Boolean findByPassword(String password);

	Boolean findByUsernameAndPassword(String username, String password);

}
