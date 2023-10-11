package com.desarrollo.apirest.entidades;

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
@NoArgsConstructor
@AllArgsConstructor
public class Autor extends BaseEntidad {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "biografia")
    private String biografia;
}
