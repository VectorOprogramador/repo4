package com.seccion4.repo4.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.seccion4.repo4.model.Persona;
import com.seccion4.repo4.repository.PersonaRepositoty;

public class PersonaService {
    @Autowired
    private PersonaRepositoty personaRepositoty;

    public Persona guardarPersona(Persona persona){
        return personaRepositoty.create(persona);
    }
}
