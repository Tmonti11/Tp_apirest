package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.Autor;
import com.desarrollo.apirest.entidades.Persona;
import com.desarrollo.apirest.repositorios.BaseRepository;
import com.desarrollo.apirest.repositorios.AutorRepository;
import com.desarrollo.apirest.servicios.AutorServicio;
import com.desarrollo.apirest.servicios.BaseServicioImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AutorServicioImpl extends BaseServicioImpl<Autor, Long> implements AutorServicio{
    @Autowired
    private AutorRepository autorRepository;


    public AutorServicioImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> search(String filtro) throws Exception {
        try {
            List<Autor> autores = autorRepository.search(filtro);
            return autores;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Autor> search(String filtro, Pageable pageable) throws Exception {
        try {
            return autorRepository.search(filtro, pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}