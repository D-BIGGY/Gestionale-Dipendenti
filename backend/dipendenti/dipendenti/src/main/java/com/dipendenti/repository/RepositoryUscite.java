package com.dipendenti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dipendenti.entity.Uscite;
@Repository
public interface RepositoryUscite extends CrudRepository<Uscite, Long>{
	
}
