package com.examen.servicios;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entidades.Entrenador;
import com.examen.entidades.Pokemon;
import com.examen.repositorio.EntrenadorRepositorio;

@Service
public class EntrenadorServicio {
	
	@Autowired
	private EntrenadorRepositorio entrenadorRepositorio;
	
	public Entrenador getEmail(String email) {
        Optional<Entrenador> entrenadorOptional = entrenadorRepositorio.findByEmail(email);
        return entrenadorOptional.orElse(null);
    }
	
	public Set<Pokemon> obtenerPokemonesPorEntrenadorId(Integer entrenadorId) {
        Optional<Entrenador> entrenadorOptional = entrenadorRepositorio.findById(entrenadorId);
        return entrenadorOptional.map(Entrenador::getPokemones).orElse(Collections.emptySet());
    }
}
