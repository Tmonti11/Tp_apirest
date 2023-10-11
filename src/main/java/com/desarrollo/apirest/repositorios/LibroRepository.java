package com.desarrollo.apirest.repositorios;


import com.desarrollo.apirest.entidades.Libro;
import org.springframework.stereotype.Repository;
import com.desarrollo.apirest.entidades.Autor;
import com.desarrollo.apirest.entidades.Libro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {




    @Query(value = "SELECT l FROM Libro l WHERE l.autor LIKE %:filtro% OR l.titulo LIKE %:filtro%")
    List<Libro> search(@Param("filtro") String filtro);
    @Query(value = "SELECT l FROM Libro l WHERE l.autor LIKE %:filtro% OR l.titulo LIKE %:filtro%")
    Page<Libro> search(@Param("filtro") String filtro, Pageable pageable);

}
