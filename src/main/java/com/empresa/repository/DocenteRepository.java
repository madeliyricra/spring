package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.empresa.entity.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {

    public List<Docente> findByNombreLike(String nombre);

    public List<Docente> findByDni(String dni);

    public List<Docente> findByNombreAndDni (String nombre, String dni);
}


