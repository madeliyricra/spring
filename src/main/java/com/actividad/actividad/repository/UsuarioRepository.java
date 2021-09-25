package com.actividad.actividad.repository;

import com.actividad.actividad.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
