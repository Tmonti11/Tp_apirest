package com.desarrollo.apirest.controladores;

import com.desarrollo.apirest.entidades.Localidad;
import com.desarrollo.apirest.servicios.LocalidadServicioImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadControlador extends BaseControladorImpl<Localidad, LocalidadServicioImpl> {
}
