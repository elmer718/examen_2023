package com.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.entidades.Pokemon;

public interface PokemonRepositorio extends JpaRepository<Pokemon, Integer>{

}
