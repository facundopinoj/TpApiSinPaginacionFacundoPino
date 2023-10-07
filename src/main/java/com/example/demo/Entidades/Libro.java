package com.example.demo.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "libro")
@Getter
@Setter

public class Libro extends Base {
    @Column(
            name = "titulo"
    )
    private String titulo;
    @Column(
            name = "fecha"
    )
    private Date fecha;
    @Column(
            name = "genero"
    )
    private String genero;
    @Column(
            name = "paginas"
    )
    private int paginas;
    @ManyToMany(
            cascade = {CascadeType.REFRESH},
            fetch = FetchType.EAGER
    )
    private List<Autor> autores;

    public Libro() {
    }

    public Libro(final String titulo, final Date fecha, final String genero, final int paginas, final List<Autor> autores) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.genero = genero;
        this.paginas = paginas;
        this.autores = autores;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public List<Autor> getAutores() {
        return this.autores;
    }

    public void setTitulo(final String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(final Date fecha) {
        this.fecha = fecha;
    }

    public void setGenero(final String genero) {
        this.genero = genero;
    }

    public void setPaginas(final int paginas) {
        this.paginas = paginas;
    }

    public void setAutores(final List<Autor> autores) {
        this.autores = autores;
    }
}
