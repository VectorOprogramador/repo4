package com.seccion4.repo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.seccion4.repo4.model.Persona;

public class PersonaRepositoty {
    private List<Persona> personas = new ArrayList<>();

    public Persona create(Persona persona){
        personas.add(persona);
        return persona;
    }

    }

