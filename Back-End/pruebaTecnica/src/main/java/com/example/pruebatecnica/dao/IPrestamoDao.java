package com.example.pruebatecnica.dao;

import com.example.pruebatecnica.entities.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrestamoDao extends JpaRepository<Prestamo, Integer> {

    public Prestamo findByCodigoPrestamo(Integer codigoPrestamo);
}
