package com.desarrollo.apirest.controladores;

import com.desarrollo.apirest.entidades.Domicilio;
import com.desarrollo.apirest.servicios.DomicilioServicioImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioControlador extends BaseControladorImpl<Domicilio, DomicilioServicioImpl>{
}
