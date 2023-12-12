package com.dipendenti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipendenti.entity.Dipendente;

public interface DipendentiRepository extends JpaRepository<Dipendente, Long> {

}
