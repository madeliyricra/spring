package com.dawii.practica.repository;

import java.util.List;
import java.util.Optional;
import com.dawii.practica.entity.Medicamento;
import com.dawii.practica.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    public MedicamentoRepository repository;

    @Override
    public List<Medicamento> listaMedicamento() {
        return repository.findAll();
    }

    @Override
    public Medicamento insertaModificaMedicamento(Medicamento obj) {
        return repository.save(obj);
    }

    @Override
    public Optional<Medicamento> obtenerPorId(int idMedicamento) {
        return repository.findById(idMedicamento);
    }

    @Override
    public void eliminarMedicamento(int idMedicamento) {
        repository.deleteById(idMedicamento);
    }

}
