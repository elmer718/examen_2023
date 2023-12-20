package com.examen.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entidades.Entrenador;
import com.examen.servicios.EntrenadorServicio;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorControlador {
	
	@Autowired
	private EntrenadorServicio entrenadorServicio;
	
	@GetMapping("/login/{email}")
	public Entrenador login(@PathVariable String email) {
		Entrenador entrenador = entrenadorServicio.getEmail(email);
		return entrenador;
	}
}
