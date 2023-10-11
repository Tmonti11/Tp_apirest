package com.desarrollo.apirest.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "libro")
public class Libro extends BaseEntidad {
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "paginas")
    private int paginas;

    @Column(name = "autor")
    private String autor;


    @ManyToMany
    @JoinTable(name = "libro_persona",
            joinColumns = @JoinColumn(name = "fk_libro"),
            inverseJoinColumns = @JoinColumn(name = "fk_persona"))
    private List<Persona> personas;

}
