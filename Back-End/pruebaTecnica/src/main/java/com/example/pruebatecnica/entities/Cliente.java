package com.example.pruebatecnica.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCliente;

    private String dpi;

    private String nombre;

    private String fechaNacimiento;

    private String direccion;

    private String telefono;

    private String estadoCivil;

    private String departamento;

    private String municipio;

    private String fechaRegistro;
}
