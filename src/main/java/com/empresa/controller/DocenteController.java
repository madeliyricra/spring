package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Docente;
import com.empresa.service.DocenteService;
import com.empresa.util.Constantes;

@RestController
@RequestMapping("/rest/docente")
@CrossOrigin(origins = "http://localhost:4200")
public class DocenteController {

	@Autowired
	private DocenteService docenteService;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Docente>> listaDocente() {
		List<Docente> lista = docenteService.listaDocente();
		return ResponseEntity.ok(lista);
	}


	@GetMapping (path = "/filtro",params = {"nombre"})
	@ResponseBody
	public ResponseEntity<List<Docente>> listaDocentePorNombreLike(@RequestParam("nombre") String nombre) {
		List<Docente> lista = docenteService.listaDocentePorNombreLike(nombre+"%");
		return ResponseEntity.ok(lista);
	}

	@GetMapping (path = "/filtro",params = {"dni"})
	@ResponseBody
	public ResponseEntity<List<Docente>> listaDocentePorDni(@RequestParam("dni") String dni) {
		List<Docente> lista = docenteService.listaDocentePorDni(dni);
		return ResponseEntity.ok(lista);
	}

	@GetMapping (path = "/filtro",params = {"nombre", "dni"})
	@ResponseBody
	public ResponseEntity<List<Docente>> listaDocentePorNombreAndDni2(@RequestParam("nombre") String nombre, @RequestParam("dni") String dni) {
		List<Docente> lista = docenteService.listaDocentePorNombreYDni(nombre, dni);
		return ResponseEntity.ok(lista);
	}

	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertaDocente(@RequestBody Docente obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			Docente objSalida = docenteService.insertaActualizaDocente(obj);
			if (objSalida == null) {
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
