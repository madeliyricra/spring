package com.actividad.actividad.controller;


import java.util.List;
import com.actividad.actividad.entity.Ciclo;
import com.actividad.actividad.service.CicloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url/ciclo")
@CrossOrigin(origins = "http://localhost:4200")
public class CicloController {
    @Autowired
    private CicloService service;

    
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Ciclo>> listaCiclo(){
        List<Ciclo> lista=service.listaCiclo();
        return ResponseEntity.ok(lista);
    }
}
