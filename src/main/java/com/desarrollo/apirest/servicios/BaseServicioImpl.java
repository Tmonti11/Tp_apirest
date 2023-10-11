package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.BaseEntidad;
import com.desarrollo.apirest.repositorios.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServicioImpl<E extends BaseEntidad, ID extends Serializable> implements BaseServicio<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServicioImpl(BaseRepository<E, ID> baseRepository){this.baseRepository = baseRepository;}

    @Override
    @Transactional
    public List<E> getAll() throws Exception {
        try {
            List<E> entidades = baseRepository.findAll();
            return entidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional

    public Page<E> getAll(Pageable pageable) throws Exception{
        try {
            Page<E> entidades = baseRepository.findAll(pageable);
            return entidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public E getById(ID id) throws Exception {
        try {
            Optional<E> entidadOpcional = baseRepository.findById(id);
            return entidadOpcional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entidadOpcional = baseRepository.findById(id);
            E estudiante = entidadOpcional.get();
            estudiante = baseRepository.save(entity);
            return estudiante;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
