package com.avatar.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avatar.backend.Entity.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{

	public Persona findByName(String name);

}
