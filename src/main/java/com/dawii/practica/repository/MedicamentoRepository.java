package com.dawii.practica.repository;

import java.util.List;

import com.dawii.practica.entity.Medicamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

    public List<Medicamento> findByStock(int stock);

    public List<Medicamento> findByNombreLike(String nombre);
}
