package com.desarrollo.apirest.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "localidad")
public class Localidad extends BaseEntidad{
    @Column(name = "denominacion")
    private String denominacion;

    @OneToMany(mappedBy = "localidad", cascade = CascadeType.PERSIST)
    private List<Domicilio> domicilios = new ArrayList<>();
}
