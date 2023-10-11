package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.Libro;
import com.desarrollo.apirest.repositorios.BaseRepository;
import com.desarrollo.apirest.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.desarrollo.apirest.entidades.Persona;
import com.desarrollo.apirest.repositorios.BaseRepository;
import com.desarrollo.apirest.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicioImpl extends BaseServicioImpl<Libro, Long> implements LibroServicio {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServicioImpl(BaseRepository<Libro, Long> baseRepository){super(baseRepository);}


    @Override
    public List<Libro> search(String filtro) throws Exception {
        try {
            List<Libro> libros = libroRepository.search(filtro);
            return libros;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Libro> search(String filtro, Pageable pageable) throws Exception {
        try {
            return libroRepository.search(filtro, pageable);
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
