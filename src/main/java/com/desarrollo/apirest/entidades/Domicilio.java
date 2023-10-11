package com.desarrollo.apirest.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends BaseEntidad {
    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fk_persona", referencedColumnName = "id")
    private Persona persona;
}
