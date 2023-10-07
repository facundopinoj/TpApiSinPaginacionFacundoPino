package com.example.demo.Service;

import jakarta.transaction.Transactional;
import com.example.demo.Entidades.Base;
import com.example.demo.Repository.BaseRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = this.baseRepository.findAll();
            return entities;
        } catch (Exception var2) {
            throw new Exception(var2.getMessage());
        }
    }

    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = this.baseRepository.findById(id);
            return (E) entityOptional.get();
        } catch (Exception var3) {
            throw new Exception(var3.getMessage());
        }
    }

    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = (E) this.baseRepository.save(entity);
            return entity;
        } catch (Exception var3) {
            throw new Exception(var3.getMessage());
        }
    }

    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = this.baseRepository.findById(id);
            E entityUpdate = (E) entityOptional.get();
            entityUpdate = (E) this.baseRepository.save(entity);
            return entityUpdate;
        } catch (Exception var5) {
            throw new Exception(var5.getMessage());
        }
    }

    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (this.baseRepository.existsById(id)) {
                this.baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception var3) {
            throw new Exception(var3.getMessage());
        }
    }
}

