package com.actividad.actividad.service;

import java.util.List;
import com.actividad.actividad.entity.Usuario;
import com.actividad.actividad.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuario> listaUsuario() {
        return repository.findAll();
    }
    
}
