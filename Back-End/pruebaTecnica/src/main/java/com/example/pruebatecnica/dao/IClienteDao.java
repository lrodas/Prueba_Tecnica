package com.example.pruebatecnica.dao;

import com.example.pruebatecnica.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Integer> {

    public abstract Cliente findByCodigoCliente(Integer codigoCliente);
}
