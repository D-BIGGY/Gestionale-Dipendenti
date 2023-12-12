package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dipendente;

@Repository
public interface DipendentiRepository extends CrudRepository<Dipendente, Long> {

}
