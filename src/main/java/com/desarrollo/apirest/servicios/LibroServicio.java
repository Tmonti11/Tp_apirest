package com.desarrollo.apirest.servicios;


import com.desarrollo.apirest.entidades.Libro;
import com.desarrollo.apirest.entidades.Autor;
import com.desarrollo.apirest.entidades.Libro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LibroServicio extends BaseServicio<Libro, Long> {




    List<Libro> search(String filtro) throws Exception;
    Page<Libro> search(String filtro, Pageable pageable) throws Exception;

}
