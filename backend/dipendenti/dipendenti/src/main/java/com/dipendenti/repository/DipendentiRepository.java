package com.dipendenti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dipendenti.entity.Dipendente;
@Repository
public interface DipendentiRepository extends JpaRepository<Dipendente, Long> {

}
