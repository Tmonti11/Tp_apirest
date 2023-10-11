package com.desarrollo.apirest.controladores;

import com.desarrollo.apirest.entidades.BaseEntidad;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseControlador <E extends BaseEntidad, ID extends Serializable> {
    public ResponseEntity<?> getAll();

    public ResponseEntity<?> getAll(Pageable pageable);

    public ResponseEntity<?> getById(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable ID id, @PathVariable E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
