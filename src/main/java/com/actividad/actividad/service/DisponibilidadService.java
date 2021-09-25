package com.actividad.actividad.service;

import java.util.List;

import com.actividad.actividad.entity.Disponibilidad;

public interface DisponibilidadService {
    public abstract List<Disponibilidad> listaDisponibilidad();
    public abstract Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj);
} 
