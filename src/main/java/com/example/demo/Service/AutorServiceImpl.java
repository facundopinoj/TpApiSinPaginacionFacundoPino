package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entidades.Autor;
import com.example.demo.Repository.AutorRepository;
import com.example.demo.Repository.BaseRepository;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
        this.autorRepository = this.autorRepository;
    }
}

