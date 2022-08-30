package com.example.pruebatecnica.services;

import com.example.pruebatecnica.entities.Cliente;

import java.util.List;

public interface IClienteService {

    public abstract Cliente save(Cliente cliente);
    public abstract List<Cliente> findAll();
    public abstract Cliente findByCodigo(Integer codigo);
}
