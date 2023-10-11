package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.Persona;
import com.desarrollo.apirest.repositorios.BaseRepository;
import com.desarrollo.apirest.repositorios.PersonaRepositroy;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServicioImpl extends BaseServicioImpl<Persona, Long> implements PersonaServicio {

    @Autowired
    private PersonaRepositroy personaRepositroy;

    public PersonaServicioImpl(BaseRepository<Persona, Long> baseRepository){super(baseRepository);}

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            List<Persona> personas = personaRepositroy.search(filtro);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepositroy.search(filtro, pageable);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
