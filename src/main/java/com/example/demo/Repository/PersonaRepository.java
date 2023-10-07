package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entidades.Persona;
@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long>{
}
