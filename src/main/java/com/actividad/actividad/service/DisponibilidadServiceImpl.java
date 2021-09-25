package com.actividad.actividad.service;

import java.util.List;
import com.actividad.actividad.entity.Disponibilidad;
import com.actividad.actividad.repository.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService{

    @Autowired
    private DisponibilidadRepository repository;

    @Override
    public List<Disponibilidad> listaDisponibilidad() {
        return repository.findAll();
    }

    @Override
    public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj) {
        return repository.save(obj);
    }
    
}
 