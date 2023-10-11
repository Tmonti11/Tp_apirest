package com.desarrollo.apirest.controladores;

import com.desarrollo.apirest.entidades.BaseEntidad;
import com.desarrollo.apirest.servicios.BaseServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControladorImpl<E extends BaseEntidad, S extends BaseServicioImpl<E, Long>>
        implements BaseControlador<E, Long> {

    @Autowired
    protected S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.getAll());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente despues.\"}");
        }
    }
    @GetMapping("/page")
    public ResponseEntity<?> getAll(Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.getAll(pageable));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente despues.\"}");
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.getById(id));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente despues.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entidad) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entidad));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Intente despues. No pudo subir el estudiante.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entidad) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entidad));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Intente despues.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Intente despues.\"}");
        }
    }
}
