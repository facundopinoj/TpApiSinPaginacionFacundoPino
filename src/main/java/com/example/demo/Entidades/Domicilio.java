package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "domi")
@Getter

public class Domicilio extends Base {

    @Column(
            name = "calle"
    )
    private String calle;
    @Column(
            name = "numero"
    )
    private int numero;
    @ManyToOne(
            optional = false
    )
    @JoinColumn(
            name = "fk_localidad"
    )
    private Localidad localidad;

    public Domicilio() {
    }

    public Domicilio(final String calle, final int numero, final Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

    public String getCalle() {
        return this.calle;
    }

    public int getNumero() {
        return this.numero;
    }

    public Localidad getLocalidad() {
        return this.localidad;
    }

    public void setCalle(final String calle) {
        this.calle = calle;
    }

    public void setNumero(final int numero) {
        this.numero = numero;
    }

    public void setLocalidad(final Localidad localidad) {
        this.localidad = localidad;
    }

}
