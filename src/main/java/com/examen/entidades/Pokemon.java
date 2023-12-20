package com.examen.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pokemon")
public class Pokemon {

	@Id
	private int id;
	
	private String nombre;
	
	private String descripcion;
	
	private TipoPokemon tipo_pokemon;
	
	
}
