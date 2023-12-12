package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Entrate;
@Repository
public interface RepositoryEntrate extends CrudRepository<Entrate, Long>{

}
