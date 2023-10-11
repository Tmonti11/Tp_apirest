package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.Autor;
import com.desarrollo.apirest.entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;



public interface AutorServicio  extends BaseServicio<Autor, Long> {

    List<Autor> search(String filtro) throws Exception;

    Page<Autor> search(String filtro, Pageable pageable) throws Exception;
}
