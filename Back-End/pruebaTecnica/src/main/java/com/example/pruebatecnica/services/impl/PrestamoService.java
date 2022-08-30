package com.example.pruebatecnica.services.impl;

import com.example.pruebatecnica.dao.IPrestamoDao;
import com.example.pruebatecnica.entities.Prestamo;
import com.example.pruebatecnica.services.IPrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService implements IPrestamoService {

    private IPrestamoDao prestamoDao;

    @Autowired
    public PrestamoService (IPrestamoDao prestamoDao) {
        this.prestamoDao = prestamoDao;
    }

    @Override
    public Prestamo save(Prestamo prestamo) {
        return this.prestamoDao.save(prestamo);
    }

    @Override
    public List<Prestamo> findAll() {
        return this.prestamoDao.findAll();
    }

    @Override
    public Prestamo findByCodigo(Integer codigo) {
        return this.prestamoDao.findByCodigoPrestamo(codigo);
    }
}
