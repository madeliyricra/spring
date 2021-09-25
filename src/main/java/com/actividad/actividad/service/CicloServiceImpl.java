package com.actividad.actividad.service;

import java.util.List;

import com.actividad.actividad.entity.Ciclo;
import com.actividad.actividad.repository.CicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CicloServiceImpl implements CicloService {

    @Autowired
    private CicloRepository repository;

    @Override
    public List<Ciclo> listaCiclo() {
        return repository.findAll();
    }
    
}
