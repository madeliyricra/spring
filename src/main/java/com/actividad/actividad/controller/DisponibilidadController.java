package com.actividad.actividad.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.actividad.actividad.entity.Disponibilidad;
import com.actividad.actividad.service.DisponibilidadService;
import com.actividad.actividad.util.Constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url/disponibilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class DisponibilidadController {
    @Autowired
    private DisponibilidadService service;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Disponibilidad>> listaDisponibilidad(){
        List<Disponibilidad> lista=service.listaDisponibilidad();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Map<String, Object>> insertaDisponibilidad(@RequestBody Disponibilidad obj){
        Map<String, Object> salida=new HashMap<>();
        try  {
            obj.setIdDisponibilidad(0);
            Disponibilidad objSalida= service.insertaActualizaDisponibilidad(obj);
            if(objSalida==null){
                salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
        } catch (Exception e) {
            e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
        }
        return ResponseEntity.ok(salida);
    }
}
