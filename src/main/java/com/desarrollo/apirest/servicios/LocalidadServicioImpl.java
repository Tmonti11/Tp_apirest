package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.Localidad;
import com.desarrollo.apirest.repositorios.BaseRepository;
import com.desarrollo.apirest.repositorios.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServicioImpl extends BaseServicioImpl<Localidad, Long> implements LocalidadServicio {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServicioImpl(BaseRepository<Localidad, Long> baseRepository) {super(baseRepository);}
}
