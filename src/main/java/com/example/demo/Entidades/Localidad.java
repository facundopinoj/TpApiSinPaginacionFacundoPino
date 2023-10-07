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

public class Localidad extends Base{
    @Column(
            name = "denominacion"
    )
    private String denominacion;

    public Localidad() {
    }

    public Localidad(final String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return this.denominacion;
    }

    public void setDenominacion(final String denominacion) {
        this.denominacion = denominacion;
    }
}
