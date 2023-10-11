package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.BaseEntidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseServicio <E extends BaseEntidad, ID extends Serializable> {
    public List<E> getAll() throws Exception;

    public Page<E> getAll(Pageable pageable) throws Exception;

    public E getById(ID id) throws Exception;
    public E save (E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws  Exception;

}
