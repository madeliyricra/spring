package com.actividad.actividad.controller;

import java.util.List;

import com.actividad.actividad.entity.Usuario;
import com.actividad.actividad.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Usuario>> listaUsuario(){
        List<Usuario> lista=service.listaUsuario();
        return ResponseEntity.ok(lista);
    }
}
