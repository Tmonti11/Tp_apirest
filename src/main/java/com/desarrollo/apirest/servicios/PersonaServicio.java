package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface PersonaServicio extends BaseServicio<Persona, Long> {

    List<Persona> search(String filtro) throws Exception;
    Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}
