package com.avatar.backend.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avatar.backend.Entity.Persona;
import com.avatar.backend.repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    
    public Object findAll(){
        return personaRepository.findAll();
    } 
    
    public Persona findById(Long id){
		return null; //personaRepository.findOne(id);
    }

    public Persona save(Persona persona){
        return personaRepository.save(persona);
    }

    public void delete(Persona persona){
    	personaRepository.delete(persona);
    	return;
    }

	public Persona findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
