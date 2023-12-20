package com.examen.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.entidades.Entrenador;

public interface EntrenadorRepositorio extends JpaRepository<Entrenador, Integer>{
	
	Optional<Entrenador> findByEmail(String email);

}
