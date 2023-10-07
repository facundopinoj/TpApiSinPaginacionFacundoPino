package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="Persona")

@Getter
@Setter
@EnableJpaAuditing
public class Persona extends Base {




    @Column(
            name = "nombre"
    )
    private String nombre;
    @Column(
            name = "apellido"
    )
    private String apellido;
    @Column(
            name = "dni"
    )
    private int dni;
    @OneToOne(
            cascade = {CascadeType.ALL}
    )
    @JoinColumn(
            name = "fk_domicilio"
    )
    private Domicilio domicilio;
    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "persona_libro",
            joinColumns = {@JoinColumn(
                    name = "persona_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "libro_id"
            )}
    )
    private List<Libro> libros = new ArrayList();

    public Persona() {
    }

    public Persona(final String nombre, final String apellido, final int dni, final Domicilio domicilio, final List<Libro> libros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.libros = libros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public Domicilio getDomicilio() {
        return this.domicilio;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(final String apellido) {
        this.apellido = apellido;
    }

    public void setDni(final int dni) {
        this.dni = dni;
    }

    public void setDomicilio(final Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setLibros(final List<Libro> libros) {
        this.libros = libros;
    }
}
