package com.dawii.practica.service;

import java.util.List;
import java.util.Optional;
import com.dawii.practica.entity.Medicamento;

public interface MedicamentoService {
    public List<Medicamento> listaMedicamento();

    public Medicamento insertaModificaMedicamento(Medicamento obj);

    public Optional<Medicamento> obtenerPorId(int idMedicamento);

    public List<Medicamento> obtenerPorStock(int stock);

    public List<Medicamento> obtenerPorNombre(String nombre);

    public void eliminarMedicamento(int idMedicamento);
}
