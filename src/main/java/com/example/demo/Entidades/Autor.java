package com.example.demo.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "autor")
@Getter
@Setter


public class Autor extends Base{

    @Column(
            name = "nombre"
    )
    private String nombre;
    @Column(
            name = "apellido"
    )
    private String apellido;
    @Column(
            name = "biografia",
            length = 1500
    )
    private String biografia;

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getBiografia() {
        return this.biografia;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(final String apellido) {
        this.apellido = apellido;
    }

    public void setBiografia(final String biografia) {
        this.biografia = biografia;
    }

    public Autor() {
    }

    public Autor(final String nombre, final String apellido, final String biografia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.biografia = biografia;
    }

}
