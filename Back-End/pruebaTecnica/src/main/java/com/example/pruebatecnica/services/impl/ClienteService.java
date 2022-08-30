package com.example.pruebatecnica.services.impl;

import com.example.pruebatecnica.dao.IClienteDao;
import com.example.pruebatecnica.entities.Cliente;
import com.example.pruebatecnica.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    private IClienteDao clienteDao;

    @Autowired
    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }

    @Override
    public Cliente save(Cliente cliente) {
        return this.clienteDao.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return this.clienteDao.findAll();
    }

    @Override
    public Cliente findByCodigo(Integer codigo) {
        return this.clienteDao.findByCodigoCliente(codigo);
    }
}
