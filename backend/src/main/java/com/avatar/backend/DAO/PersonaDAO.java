package com.avatar.backend.DAO;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.avatar.backend.Entity.Persona;

@Repository
public class PersonaDAO {

	private static Map<Integer, Persona> persona;
}
