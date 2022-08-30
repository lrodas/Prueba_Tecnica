package com.example.pruebatecnica.services;

import com.example.pruebatecnica.entities.Cliente;
import com.example.pruebatecnica.entities.Prestamo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPrestamoService {

    public abstract Prestamo save(Prestamo prestamo);

    public abstract List<Prestamo> findAll();

    public abstract Prestamo findByCodigo(Integer codigo);
}
