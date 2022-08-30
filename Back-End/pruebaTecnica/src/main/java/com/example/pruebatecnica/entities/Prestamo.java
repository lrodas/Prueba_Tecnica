package com.example.pruebatecnica.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prestamos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoPrestamo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_cliente")
    private Cliente cliente;

    private Double monto;

    private Integer cantidadCuotas;

    private Date fechaRegistro;
}
