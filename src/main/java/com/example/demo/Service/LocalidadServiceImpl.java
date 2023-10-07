package com.example.demo.Service;

import org.springframework.stereotype.Service;
import com.example.demo.Entidades.Localidad;
import com.example.demo.Repository.BaseRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
