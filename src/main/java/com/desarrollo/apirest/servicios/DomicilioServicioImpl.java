package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.Domicilio;
import com.desarrollo.apirest.repositorios.BaseRepository;
import com.desarrollo.apirest.repositorios.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServicioImpl extends BaseServicioImpl<Domicilio, Long> implements DomicilioServicio {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServicioImpl(BaseRepository<Domicilio, Long> baseRepository){super(baseRepository);}
}
