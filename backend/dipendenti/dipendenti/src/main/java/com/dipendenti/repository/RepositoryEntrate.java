package com.dipendenti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dipendenti.entity.Entrate;
@Repository
public interface RepositoryEntrate extends CrudRepository<Entrate, Long>{

}
