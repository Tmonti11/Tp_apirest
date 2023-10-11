package com.desarrollo.apirest.repositorios;

import com.desarrollo.apirest.entidades.Domicilio;
import com.desarrollo.apirest.entidades.Localidad;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {
}
